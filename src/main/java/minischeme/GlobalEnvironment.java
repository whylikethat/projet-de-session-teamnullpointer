package minischeme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;


public class GlobalEnvironment {

  public static Map<String, Object> build() {
    var env = new HashMap<String, Object>();

    env.put("begin", (Procedure) (List<Object> params) -> {
      return params.get(params.size() - 1);
    });

    env.put("<", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size()-1; i++) result = result && (Double) params.get(i) < (Double) params.get(i+1);
      return result;
    });

    env.put("*", (Procedure) (List<Object> params) -> {
      var product = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) product *= (Double) x;
      return product;
    });

    env.put("+", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result += (Double) x;
      return result;
    });

    env.put("-", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result -= (Double) x;
      return result;
    });
    env.put("and", (Procedure) (List<Object> params) -> {
      for(int i = 0; i < params.size(); i++) {
          boolean b = (Boolean)params.get(i);
          if(!b) return false;
      }
      return true;
    });

    env.put("count", (Procedure) (List<Object> params) -> {
        List<Object> temp = (List<Object>)params.get(0);
        return (double)temp.size();
    });

    env.put("head", (Procedure) (List<Object> params) -> {
        List<Object> temp = (List<Object>)params.get(0);
        return temp.get(0);
    });

    env.put("tail", (Procedure) (List<Object> params) -> {
        List<Object> temp = (List<Object>)params.get(0);
        return temp.subList(1, temp.size());
    });

    env.put("append", (Procedure) (List<Object> params) -> {
      var concat = new ArrayList<Object>();
      for (int i = 0; i < params.size(); i++) concat.addAll((List<Object>) params.get(i));
      return concat;
    });

    env.put("not", (Procedure) (List<Object> params) -> {
      boolean b = (Boolean)params.get(0);
      return !b;
    });

    env.put("eq", (Procedure) (List<Object> params) -> {
      double d = (Double)params.get(0);
      for(int i = 1; i < params.size(); i++) {
      if((Double)params.get(i) != d) return false;
      }
      return true;
    });

    return env;
  }
}
