package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Map;

/* renamed from: X.19r  reason: invalid class name and case insensitive filesystem */
public class C223819r {
    public static final int A07 = (C223919s.A00.getBytes().length + 1);
    public static final byte[] A08 = {0, 10};
    public C224419y A00;
    public MappedByteBuffer A01;
    public Map A02;
    public final C200710s A03;
    public volatile File A04;
    public volatile String A05 = "unknown";
    public volatile boolean A06;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.00O, java.util.Map] */
    public Map A00() {
        BufferedReader bufferedReader;
        if (!this.A06) {
            return new AnonymousClass00O(0);
        }
        Map map = this.A02;
        if (map != null) {
            return map;
        }
        ? r5 = new AnonymousClass00O(5);
        for (int i = 0; i < 5; i++) {
            String valueOf = String.valueOf(i);
            if (!valueOf.equals(this.A05)) {
                File file = new File(this.A04, valueOf);
                if (file.exists()) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        r5.put(bufferedReader.readLine(), file);
                        bufferedReader.close();
                    } catch (IOException unused) {
                        continue;
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                    }
                } else {
                    continue;
                }
            }
        }
        this.A02 = r5;
        return r5;
        throw th;
    }

    public void A01(C17930vS r4) {
        this.A03.execute(new C448825d(this, r4, 6));
    }

    public void A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        this.A03.execute(new C449625l(1, sb.toString(), this));
    }

    public C223819r(AnonymousClass10I r3) {
        this.A03 = new C200710s(r3, true);
    }
}
