import org.apache.commons.io.FilenameUtils;
import net.sf.jasperreports.engine.JasperCompileManager;

public class App {
    public static void main(String[] jrxml) throws Exception {
        if (jrxml.length == 1) {
            String jasper = FilenameUtils.getFullPath(jrxml[0])+FilenameUtils.getBaseName(jrxml[0])+".jasper";
            JasperCompileManager.compileReportToFile(jrxml[0],jasper);
            System.out.println(jasper+" generated!");
        } else {
            System.err.println("Expecting 1 .jrxml's file path as argument, but "+jrxml.length+" argument(s) given!");
        }
    }
}
