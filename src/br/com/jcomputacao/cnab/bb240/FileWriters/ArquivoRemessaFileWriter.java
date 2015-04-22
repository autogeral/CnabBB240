/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.bb240.FileWriters;

import br.com.jcomputacao.aristoteles.file.FileArchetype;
import br.com.jcomputacao.aristoteles.file.FileModel;
import br.com.jcomputacao.cnab.bb240.LineWriters.HeaderArquivoWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.HeaderLoteWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.SegmentoPWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.SegmentoQWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.SegmentoRWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.SegmentoSWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.TraillerArquivoWriter;
import br.com.jcomputacao.cnab.bb240.LineWriters.TraillerLoteWriter;
import br.com.jcomputacao.cnab.bb240.models.remessa.HeaderArquivoModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.HeaderLoteModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoPModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoQModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoRModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.SegmentoSModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.TraillerArquivoModel;
import br.com.jcomputacao.cnab.bb240.models.remessa.TraillerLoteModel;
import java.util.LinkedList;

/**
 *
 * @author Marcos
 */
public class ArquivoRemessaFileWriter extends FileArchetype{

    public static FileModel getArquivoRemessaFileWriter(LinkedList<Object> lista){
        FileModel file = new FileModel();
        for(Object ob : lista){
            if(ob instanceof HeaderArquivoModel){
                file.addLine(HeaderArquivoWriter.getHeaderArquivoLine((HeaderArquivoModel) ob ));
            }
            if(ob instanceof HeaderLoteModel){
                file.addLine(HeaderLoteWriter.getHeaderLoteLine((HeaderLoteModel) ob ));
            }
            if(ob instanceof SegmentoPModel){
                file.addLine(SegmentoPWriter.getSegmentoPLine((SegmentoPModel) ob ));
            }
            if(ob instanceof SegmentoQModel){
                file.addLine(SegmentoQWriter.getSegmentoQLine((SegmentoQModel) ob ));
            }
            if(ob instanceof SegmentoRModel){
                file.addLine(SegmentoRWriter.getSegmentoRLine((SegmentoRModel) ob ));
            }
            if(ob instanceof SegmentoSModel){
                file.addLine(SegmentoSWriter.getSegmentoSLine((SegmentoSModel) ob ));
            }
            if(ob instanceof TraillerLoteModel){
                file.addLine(TraillerLoteWriter.getTraillerLoteLine((TraillerLoteModel) ob ));
            }
            if(ob instanceof TraillerArquivoModel){
                file.addLine(TraillerArquivoWriter.getTraillerArquivoWriter((TraillerArquivoModel) ob ));
            }
        }
        return file;
    }
}
