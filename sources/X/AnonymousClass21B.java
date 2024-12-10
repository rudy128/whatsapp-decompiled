package X;

import android.database.Cursor;

/* renamed from: X.21B  reason: invalid class name */
public class AnonymousClass21B extends AnonymousClass218 {
    public String A00;
    public String A01;
    public String A02;

    public AnonymousClass21B(AnonymousClass205 r2, long j) {
        super(r2, 5, j);
        this.A02 = 1;
        this.A02 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.startsWith(r2) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A19() {
        /*
            r4 = this;
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0068
            if (r1 == 0) goto L_0x005a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001d
            X.C17960vV.A07(r2)
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x005a
        L_0x001d:
            java.lang.String r1 = r4.A00
        L_0x001f:
            X.C17960vV.A07(r1)
        L_0x0022:
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r3 = X.AnonymousClass1EG.A0C(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r2.append(r0)
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r3.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r0 = "&sll="
            r2.append(r0)
            double r0 = r4.A00
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            double r0 = r4.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x005a:
            java.lang.String r0 = r4.A1A()
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r4.A1A()
            goto L_0x001f
        L_0x0065:
            java.lang.String r1 = ""
            goto L_0x0022
        L_0x0068:
            java.lang.String r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass21B.A19():java.lang.String");
    }

    public String A1A() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        return sb.toString();
    }

    public void A17(Cursor cursor) {
        super.A17(cursor);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    public void A18(Cursor cursor, AnonymousClass11S r3) {
        super.A18(cursor, r3);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }
}
