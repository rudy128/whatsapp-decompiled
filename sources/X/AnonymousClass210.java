package X;

import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.210  reason: invalid class name */
public class AnonymousClass210 extends AnonymousClass206 implements C438020z {
    public int A00;
    public int A01 = 0;
    public TextData A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public byte[] A08;

    public AnonymousClass210(AnonymousClass205 r2, long j) {
        super(r2, 0, j);
    }

    public static void A0A(AnonymousClass210 r1, AnonymousClass210 r2) {
        r2.A06 = r1.A06;
        r2.A05 = r1.A05;
        r2.A07 = r1.A07;
        r2.A02 = r1.A02;
        r2.A08 = r1.A08;
        r2.A01 = r1.A01;
        r2.A00 = r1.A00;
        r2.A04 = r1.A04;
        r2.A03 = r1.A03;
    }

    public String A17() {
        if (!(this instanceof C439521o)) {
            return A0P();
        }
        C439521o r4 = (C439521o) this;
        if (TextUtils.isEmpty(r4.A0P())) {
            return r4.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("*");
        sb2.append(r4.A0P());
        sb2.append("*");
        sb.append(sb2.toString());
        sb.append("\n\n");
        sb.append(r4.A00.A02);
        return sb.toString();
    }

    public void A18(TextData textData) {
        byte[] bArr = this.A08;
        if (bArr != null) {
            textData.thumbnail = bArr;
            this.A08 = null;
        }
        this.A02 = textData;
    }

    public void A19(byte[] bArr) {
        TextData textData = this.A02;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A08 = bArr;
        }
    }

    public byte[] A1A() {
        TextData textData = this.A02;
        if (textData != null) {
            return textData.thumbnail;
        }
        return this.A08;
    }

    public Integer BXm() {
        return this.A03;
    }

    public AnonymousClass210(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }
}
