package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2MQ  reason: invalid class name */
public class AnonymousClass2MQ extends C436420i {
    public long A00;
    public String A01;
    public final boolean A02;

    public void A0i(String str) {
        if (str != null) {
            List A0S = AnonymousClass1YF.A0S(str, new String[]{","}, 0);
            if (A0S.size() < 2) {
                Log.e("FMessageSystemEventUpdated/setData invalid data: index out of bounds");
                return;
            }
            this.A00 = C17900vP.A01(AnonymousClass1YD.A04(C17880vN.A0w(A0S, 0)));
            this.A01 = C17880vN.A0w(A0S, 1);
        }
    }

    public AnonymousClass2MQ(AnonymousClass205 r1, String str, int i, long j, long j2, boolean z) {
        super(r1, i, j);
        this.A00 = j2;
        this.A01 = str;
        this.A02 = z;
    }
}
