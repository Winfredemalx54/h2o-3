package ai.h2o.automl.preprocessing;

import java.util.HashMap;

public class PreprocessingConfig extends HashMap<String, Object> {
    
    boolean getBoolean(String key, boolean defaultValue) {
        return (boolean) getOrDefault(key, defaultValue);
    }
}
