package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1tf  reason: invalid class name and case insensitive filesystem */
public class C39801tf {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public Rect A04;
    public C001100p A05;
    public AnonymousClass04B A06;
    public List A07;
    public List A08;
    public Map A09;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public final C40221uM A0D = new C40221uM();
    public final HashSet A0E = new HashSet();

    public float A00() {
        return (float) ((long) (((this.A00 - this.A02) / this.A01) * 1000.0f));
    }

    public C54042dV A01(String str) {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            C54042dV r4 = (C54042dV) this.A08.get(i);
            String str2 = r4.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return r4;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C40941vX A002 : this.A07) {
            sb.append(A002.A00("\t"));
        }
        return sb.toString();
    }

    public void A02(String str) {
        C196379ux.A00(str);
        this.A0E.add(str);
    }
}
