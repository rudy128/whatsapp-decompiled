package X;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.Dbj  reason: case insensitive filesystem */
public class C27312Dbj extends HashMap<String, Object> {
    public final /* synthetic */ C22797BPk this$0;
    public final /* synthetic */ String val$surface;

    public C27312Dbj(C22797BPk bPk, String str) {
        this.this$0 = bPk;
        this.val$surface = str;
        put("surface", str);
        BlockingQueue blockingQueue = C22797BPk.A03;
        put("bytes_downloaded", Long.valueOf(bPk.A01.get()));
        put("cache_hit_count", Long.valueOf(bPk.A00.get()));
        put("cache_miss_count", Long.valueOf(bPk.A01.get()));
    }
}
