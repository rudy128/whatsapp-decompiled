package X;

import java.util.HashMap;

/* renamed from: X.Dbl  reason: case insensitive filesystem */
public class C27314Dbl extends HashMap<String, Object> {
    public final /* synthetic */ BIS this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public C27314Dbl(BIS bis, String str, long j) {
        this.this$0 = bis;
        this.val$currentTime = j;
        this.val$surface = str;
        double d = BIS.A0n;
        put("duration", C108945cZ.A1B(j, bis.A0H));
        put("surface", str == null ? "unknown" : str);
    }
}
