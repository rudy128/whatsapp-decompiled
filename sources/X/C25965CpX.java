package X;

import android.graphics.RectF;
import java.io.File;
import java.util.HashSet;

/* renamed from: X.CpX  reason: case insensitive filesystem */
public class C25965CpX {
    public long A00;
    public long A01;
    public long A02;
    public RectF A03;
    public C25752ClM A04;
    public E9F A05;
    public C26052CrM A06;
    public CAP A07;
    public CZT A08;
    public C5G A09;
    public File A0A;
    public String A0B;
    public String A0C;
    public HashSet A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static void A00(C25965CpX cpX) {
        cpX.A03 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        cpX.A02 = -1;
        cpX.A00 = -1;
        cpX.A0E = false;
        cpX.A0F = false;
        cpX.A01 = -1;
        cpX.A0D = new HashSet();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CAP, java.lang.Object] */
    public C25965CpX(CUT cut) {
        A00(this);
        try {
            new Object();
            this.A07 = new Object();
            this.A0A = cut.A0A;
            String str = cut.A0C;
            if (str != null) {
                this.A0C = str;
            }
            this.A06 = cut.A06;
            this.A03 = cut.A03;
            this.A02 = cut.A02;
            this.A00 = cut.A00;
            this.A0E = cut.A0E;
            this.A0F = cut.A0F;
            this.A05 = cut.A05;
            this.A04 = cut.A04;
            this.A09 = cut.A09;
            this.A0I = cut.A0I;
            this.A0H = cut.A0H;
            this.A0G = cut.A0G;
            this.A08 = cut.A08;
            this.A0M = cut.A0L;
            this.A0N = cut.A0M;
            this.A0J = cut.A0J;
            this.A01 = cut.A01;
            this.A07 = cut.A07;
            this.A0K = cut.A0K;
            this.A0L = cut.A0N;
            this.A0D = cut.A0D;
            this.A0B = cut.A0B;
        } catch (C2Z e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CAP, java.lang.Object] */
    public C25965CpX() {
        A00(this);
        try {
            new Object();
            this.A07 = new Object();
        } catch (C2Z e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }
}
