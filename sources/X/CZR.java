package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

public final class CZR {
    public Bitmap A00;
    public Rect A01;
    public Rect A02;
    public C25089CXa A03;
    public C25751ClL A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public byte[] A0F;
    public byte[] A0G;
    public final int A0H;
    public final int A0I;
    public final Rect A0J;

    public Object A00(CKO cko) {
        int i = cko.A00;
        switch (i) {
            case 0:
                return this.A0F;
            case 1:
                return this.A03;
            case 2:
                return this.A02;
            case 7:
                return this.A0E;
            case 8:
                return this.A0A;
            case 9:
                return this.A06;
            case 10:
                return this.A08;
            case 11:
                return this.A07;
            case 13:
                return null;
            case 14:
                return this.A04;
            case 15:
                return this.A0B;
            case 16:
                return this.A0D;
            case 17:
                return this.A05;
            case 18:
                return this.A0C;
            case 19:
                return this.A0G;
            default:
                throw BEA.A0h("Failed to get photo capture value: ", AnonymousClass000.A10(), i);
        }
    }

    public void A01(CKO cko, Object obj) {
        int i = cko.A00;
        switch (i) {
            case 0:
                this.A0F = (byte[]) obj;
                return;
            case 1:
                this.A03 = (C25089CXa) obj;
                return;
            case 2:
                this.A02 = (Rect) obj;
                return;
            case 7:
                this.A0E = (Long) obj;
                return;
            case 8:
                this.A0A = (Integer) obj;
                return;
            case 9:
                this.A06 = (Float) obj;
                return;
            case 10:
                this.A08 = (Integer) obj;
                return;
            case 11:
                this.A07 = (Float) obj;
                return;
            case 13:
                return;
            case 14:
                this.A04 = (C25751ClL) obj;
                return;
            case 15:
                this.A0B = (Integer) obj;
                return;
            case 16:
                this.A0D = (Integer) obj;
                return;
            case 17:
                this.A05 = (Boolean) obj;
                return;
            case 18:
                this.A0C = (Integer) obj;
                return;
            case 19:
                this.A0G = (byte[]) obj;
                return;
            case 20:
                this.A09 = (Integer) obj;
                return;
            default:
                throw BEA.A0h("Failed to set photo capture value: ", AnonymousClass000.A10(), i);
        }
    }

    public CZR(Rect rect, Rect rect2, int i, int i2) {
        this.A01 = rect;
        this.A0J = rect2;
        this.A0I = i;
        this.A0H = i2;
    }
}
