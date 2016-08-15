package mo.masu.couchbasedemo.model;

import com.couchbase.lite.support.LazyJsonObject;

/**
 * Created by WilayahDua on 10/08/2016.
 */
public class Business {
    private LazyJsonObject mLazy;

    public Business(LazyJsonObject lazyJsonObject) {
        mLazy = lazyJsonObject;
    }

    public String getName() {
        return (String) mLazy.get("name");
    }

    public String getId() {
        return (String) mLazy.get("_id");
    }

    public String getKBLI() {
        return (String) mLazy.get("kbli");
    }
}

