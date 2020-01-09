package minischeme;

import minischeme.parser.api.Parser;

import java.io.File;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
  public static void main(String... args) throws Exception {
    String content = new String(Files.readAllBytes(Paths.get(args[0])), "UTF-8");
    List<Object> code = new Parser().parseString(content);
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(result);
  }
}
