package X;

/* renamed from: X.37y  reason: invalid class name and case insensitive filesystem */
public class C696337y implements BCG {
    public int A00 = 0;
    public boolean A01;
    public final long A02;
    public final C191779nA A03;
    public final C696437z A04;

    public long BNK() {
        if (this.A01) {
            return this.A04.BNK();
        }
        return this.A02;
    }

    public C191779nA BQ1() {
        if (!this.A01) {
            return this.A03;
        }
        return this.A04.A01;
    }

    public void Bt5(boolean z, int i) {
        if (this.A01) {
            this.A04.Bt5(z, i);
        }
        if (!z || this.A00 > 1) {
            this.A01 = true;
        }
        this.A00++;
    }

    public C696337y(C696437z r11, String str, long j) {
        this.A04 = r11;
        this.A03 = new C191779nA(str, str, "", r11.A0B, (String) null, (String) null, "fallback", 0, false);
        this.A02 = j;
    }
}
