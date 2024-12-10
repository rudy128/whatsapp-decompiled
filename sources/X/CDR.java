package X;

public abstract class CDR {
    public static /* synthetic */ boolean A00(C1405471x r4) {
        boolean z = false;
        if (!r4.A08) {
            C109545dc r2 = new C109545dc("VideoMeta/isSlomo");
            try {
                r2.A00(r4.A05);
                try {
                    String extractMetadata = r2.extractMetadata(25);
                    if (extractMetadata != null && Float.parseFloat(extractMetadata) > 60.0f) {
                        z = true;
                    }
                    r2.close();
                    return z;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } catch (Exception unused) {
                r2.close();
            }
        }
        return false;
    }
}
