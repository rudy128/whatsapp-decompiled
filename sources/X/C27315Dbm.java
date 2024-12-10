package X;

import java.util.HashMap;

/* renamed from: X.Dbm  reason: case insensitive filesystem */
public class C27315Dbm extends HashMap<String, Object> {
    public final /* synthetic */ BIS this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public C27315Dbm(BIS bis, String str, long j) {
        this.this$0 = bis;
        this.val$currentTime = j;
        this.val$surface = str;
        double d = BIS.A0n;
        put("duration", C108945cZ.A1B(j, bis.A0K));
        put("surface", str == null ? "unknown" : str);
    }
}
