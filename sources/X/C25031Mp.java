package X;

/* renamed from: X.1Mp  reason: invalid class name and case insensitive filesystem */
public class C25031Mp {
    public final C25041Mq A00;
    public final String A01;
    public final String A02;

    public C25031Mp(C25021Mo r4) {
        String str = r4.A02;
        C17960vV.A07(str);
        this.A02 = str;
        C25041Mq r0 = r4.A00;
        C17960vV.A07(r0);
        this.A00 = r0;
        String str2 = "";
        if (r4.A05) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" PRIMARY KEY");
            str2 = sb.toString();
        }
        if (r4.A03) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" AUTOINCREMENT");
            str2 = sb2.toString();
        }
        if (r4.A04) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(" NOT NULL");
            str2 = sb3.toString();
        }
        if (r4.A06) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(" UNIQUE");
            str2 = sb4.toString();
        }
        if (!AnonymousClass1EG.A0H(r4.A01)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(" DEFAULT ");
            sb5.append(r4.A01);
            str2 = sb5.toString();
        }
        this.A01 = str2;
    }

    @Deprecated
    public C25031Mp(C25041Mq r1, String str, String str2) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = str2;
    }
}
