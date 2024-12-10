package X;

import android.content.Context;

/* renamed from: X.CqB  reason: case insensitive filesystem */
public class C25995CqB {
    public static volatile C25995CqB A0C;
    public final Context A00;
    public final C24471C5l A01;
    public final C24476C5r A02;
    public final CBu A03;
    public final C25063CVv A04;
    public final C25754ClP A05;
    public final CC9 A06;
    public final C22415B6x A07;
    public final C26285Cwg A08;
    public final C191469me A09;
    public final C25415CfN A0A;
    public final C25708Cke A0B;

    public static C25995CqB A00() {
        if (A0C == null) {
            synchronized (C25995CqB.class) {
                if (A0C == null) {
                    throw AnonymousClass000.A0n("Can't find bloks instance. Is it initialized?");
                }
            }
        }
        return A0C;
    }

    public C25708Cke A02() {
        C25708Cke cke = this.A0B;
        if (cke != null) {
            return cke;
        }
        throw AnonymousClass000.A0n("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
    }

    public C25995CqB(Context context, C24471C5l c5l, C24476C5r c5r, C25415CfN cfN, CBu cBu, E6C e6c, C25754ClP clP, CC9 cc9, C22415B6x b6x, C26285Cwg cwg, C25708Cke cke, C191469me r13) {
        this.A00 = context;
        this.A07 = b6x;
        this.A03 = cBu;
        this.A06 = cc9;
        this.A08 = cwg;
        this.A01 = c5l;
        this.A05 = clP;
        this.A02 = c5r;
        this.A0B = cke;
        this.A0A = cfN;
        this.A09 = r13;
        this.A04 = new C25063CVv(e6c);
    }

    public static C25708Cke A01() {
        return A00().A02();
    }
}
