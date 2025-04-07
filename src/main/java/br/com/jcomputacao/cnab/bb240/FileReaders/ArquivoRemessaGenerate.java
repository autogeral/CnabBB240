package br.com.jcomputacao.cnab.bb240.FileReaders;

import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoTModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoUModel;
import br.com.jcomputacao.cnab.bb240.util.DoubleUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 12/03/2015 14:10:02
 *
 * @author Thiago
 */
public class ArquivoRemessaGenerate  {

    public static List<Object> getArquivoModels(File file) throws FileNotFoundException, IOException, ParseException {
        List<Object> lista = new LinkedList<Object>();
        FileReader fr = new FileReader(file);
        BufferedReader buf = new BufferedReader(fr);
        String linha = "";
        while (buf.ready()) {
            linha = buf.readLine();
            if (linha.charAt(13) == 'T') {
                SegmentoTModel model = filtraTModel(linha);
                lista.add(model);
            }
            if (linha.charAt(13) == 'U') {
                SegmentoUModel model = filtraUModel(linha);
                lista.add(model);
            }
        }
        buf.close();
        fr.close();
        return lista;
    }

    private static SegmentoTModel filtraTModel(String linha) throws ParseException {
        SegmentoTModel model = new SegmentoTModel();
        model.setDataVencimentoTitulo(new SimpleDateFormat("ddMMyyyy").parse(linha.substring(73, 80)));
        model.setIdentificacao(linha.substring(213, 222));
        model.setIdentificacaoTitulo(linha.substring(37, 56));
        model.setIdentificacaoTituloEmpresa(linha.substring(105, 129));
        model.setNumeroAgencia(Long.parseLong(linha.substring(17, 21)));
        model.setNumeroAgenciaCobradoraRecebedora(Long.parseLong(linha.substring(99, 103)));
        model.setNumeroBanco(Long.parseLong(linha.substring(96, 98)));
        model.setNumeroCodigoCarteira(Long.parseLong(linha.substring(57, 57)));
        model.setNumeroCodigoMoeda(Long.parseLong(linha.substring(130, 131)));
        model.setNumeroCodigoRetorno(Long.parseLong(linha.substring(15, 16)));
        model.setNumeroContaCorrente(Long.parseLong(linha.substring(23, 34)));
        model.setNumeroDigitoVerificadorAgencia(Long.parseLong(linha.substring(22, 22)));
        model.setNumeroDigitoVerificadorAgenciaCobRec(Long.parseLong(linha.substring(104, 104)));
        model.setNumeroDigitoVerificadorAgenciaContaCorrente(Long.parseLong(linha.substring(36, 36)));
        model.setNumeroDigitoVerificadorContaCorrente(Long.parseLong(linha.substring(35, 35)));
        model.setNumeroDocCobranca(linha.substring(58, 72));
        model.setNumeroLoteServico(Long.parseLong(linha.substring(3, 6)));
        model.setNumeroSequencial(Long.parseLong(linha.substring(8, 12)));
        model.setValorNominalTitulo(Double.parseDouble(linha.substring(81, 95)));
        model.setValorTarifaCustas(Double.parseDouble(linha.substring(198, 213)));
        return model;
    }

    private static SegmentoUModel filtraUModel(String linha) throws ParseException {
        SegmentoUModel model = new SegmentoUModel();
        model.setDataEfetivacaoCredito(new SimpleDateFormat("ddMMyyyy").parse(linha.substring(145, 152)));
        model.setDataOcorrencia(new SimpleDateFormat("ddMMyyyy").parse(linha.substring(137, 144)));
        model.setNumeroCodigoRetorno(Long.parseLong(linha.substring(15, 16)));
        model.setNumeroLoteServico(Long.parseLong(linha.substring(3, 6)));
        model.setNumeroSequencial(Long.parseLong(linha.substring(8, 12)));
        model.setValorAbatimentoConcedCancel(DoubleUtil.getDouble2Dec(linha.substring(47, 61)));
        model.setValorDesconto(DoubleUtil.getDouble2Dec(linha.substring(32, 46)));
        model.setValorIOF(DoubleUtil.getDouble2Dec(linha.substring(62, 76)));
        model.setValorJurosMultaEncargos(DoubleUtil.getDouble2Dec(linha.substring(17, 31)));
        model.setValorLiquidoCreditado(DoubleUtil.getDouble2Dec(linha.substring(92, 106)));
        model.setValorOutrasDespesas(DoubleUtil.getDouble2Dec(linha.substring(107, 121)));
        model.setValorOutrosCreditos(DoubleUtil.getDouble2Dec(linha.substring(122, 136)));
        model.setValorPagoSacado(DoubleUtil.getDouble2Dec(linha.substring(77, 91)));
        return model;
    }
}
