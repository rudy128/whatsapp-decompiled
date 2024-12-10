package X;

import java.util.Map;

/* renamed from: X.CmY  reason: case insensitive filesystem */
public abstract class C25821CmY {
    public static final Object A02(C23196Bcq bcq, Object obj) {
        C28449E1p e1p = bcq.A04;
        if (e1p == null) {
            return obj;
        }
        C23212BdN bdN = (C23212BdN) e1p;
        Object obj2 = bdN.A01.get(AnonymousClass000.A0M(obj));
        if (obj2 != null || !bdN.A02.containsKey("gms_unknown")) {
            return obj2;
        }
        return "gms_unknown";
    }

    public static final void A03(C23196Bcq bcq, Object obj, StringBuilder sb) {
        String obj2;
        int i = bcq.A01;
        if (i == 11) {
            Class cls = bcq.A05;
            C18210vx.A00(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C197459wj.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public Object A04(C23196Bcq bcq) {
        if (this instanceof C23258Be8) {
            C23258Be8 be8 = (C23258Be8) this;
            int i = bcq.A03;
            if (i == 1) {
                return Integer.valueOf(be8.A05);
            }
            if (i == 2) {
                return be8.A01;
            }
            if (i == 3) {
                return Integer.valueOf(be8.A00);
            }
            if (i == 4) {
                return be8.A02;
            }
            throw AnonymousClass8BX.A0W("Unknown SafeParcelable id=", AnonymousClass000.A10(), i);
        } else if (this instanceof C23257Be7) {
            C23257Be7 be7 = (C23257Be7) this;
            int i2 = bcq.A03;
            if (i2 == 1) {
                return Integer.valueOf(be7.A04);
            }
            if (i2 == 2) {
                return be7.A00;
            }
            if (i2 == 3) {
                return be7.A01;
            }
            if (i2 == 4) {
                return be7.A02;
            }
            throw AnonymousClass8BX.A0W("Unknown SafeParcelable id=", AnonymousClass000.A10(), i2);
        } else if (this instanceof C23256Be6) {
            C23256Be6 be6 = (C23256Be6) this;
            int i3 = bcq.A03;
            switch (i3) {
                case 1:
                    return Integer.valueOf(be6.A05);
                case 2:
                    return be6.A00;
                case 3:
                    return be6.A01;
                case 4:
                    return be6.A02;
                case 5:
                    return be6.A03;
                case 6:
                    return be6.A04;
                default:
                    throw AnonymousClass8BX.A0W("Unknown SafeParcelable id=", AnonymousClass000.A10(), i3);
            }
        } else if (this instanceof C23255Be5) {
            C23255Be5 be5 = (C23255Be5) this;
            int i4 = bcq.A03;
            if (i4 == 1) {
                return Integer.valueOf(be5.A03);
            }
            if (i4 == 2) {
                return be5.A01;
            }
            if (i4 == 4) {
                return be5.A00;
            }
            throw AnonymousClass8BX.A0W("Unknown SafeParcelable id=", AnonymousClass000.A10(), i4);
        } else {
            String str = bcq.A06;
            boolean z = ((C23221BdX) this) instanceof C23220BdW;
            if (bcq.A05 != null) {
                if (z) {
                    throw BE6.A0v("Converting to JSON does not require this method.");
                }
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("get");
                    return C108995ce.A0V(getClass(), this, C17890vO.A0Z(substring, A10, upperCase));
                } catch (Exception e) {
                    throw AnonymousClass8BR.A0x(e);
                }
            } else if (!z) {
                return null;
            } else {
                throw BE6.A0v("Converting to JSON does not require this method.");
            }
        }
    }

    public Map A05() {
        if (this instanceof C23220BdW) {
            C23220BdW bdW = (C23220BdW) this;
            C23105BbK bbK = bdW.A01;
            if (bbK == null) {
                return null;
            }
            String str = bdW.A02;
            C18210vx.A00(str);
            return (Map) bbK.A02.get(str);
        } else if (this instanceof C23258Be8) {
            return C23258Be8.A07;
        } else {
            if (this instanceof C23257Be7) {
                return C23257Be7.A06;
            }
            if (this instanceof C23256Be6) {
                return C23256Be6.A06;
            }
            return C23255Be5.A05;
        }
    }

    public boolean A06(C23196Bcq bcq) {
        if (this instanceof C23258Be8) {
            return C108965cb.A1b(((C23258Be8) this).A06, bcq.A03);
        }
        if (this instanceof C23257Be7) {
            return C108965cb.A1b(((C23257Be7) this).A05, bcq.A03);
        }
        if (this instanceof C23256Be6) {
            return true;
        }
        if (this instanceof C23255Be5) {
            return C108965cb.A1b(((C23255Be5) this).A04, bcq.A03);
        }
        if (bcq.A02 == 11) {
            if (bcq.A09) {
                throw BE6.A0v("Concrete type arrays not supported");
            }
            throw BE6.A0v("Concrete types not supported");
        } else if (!(((C23221BdX) this) instanceof C23220BdW)) {
            return false;
        } else {
            throw BE6.A0v("Converting to JSON does not require this method.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r6 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r0 = android.util.Base64.encodeToString(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r5 = r9.A05()
            r0 = 100
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)
            java.util.Iterator r8 = X.AnonymousClass8BU.A0x(r5)
        L_0x000e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r2 = X.C17880vN.A0v(r8)
            java.lang.Object r7 = r5.get(r2)
            X.Bcq r7 = (X.C23196Bcq) r7
            boolean r0 = r9.A06(r7)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A04(r7)
            java.lang.Object r6 = A02(r7, r0)
            int r0 = r3.length()
            java.lang.String r4 = ","
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "{"
            r3.append(r0)
        L_0x0039:
            java.lang.String r1 = "\""
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = "\":"
            r3.append(r0)
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "null"
        L_0x004a:
            r3.append(r0)
            goto L_0x000e
        L_0x004e:
            int r0 = r7.A02
            switch(r0) {
                case 8: goto L_0x007d;
                case 9: goto L_0x0084;
                case 10: goto L_0x009b;
                default: goto L_0x0053;
            }
        L_0x0053:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0079
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            java.lang.String r0 = "["
            r3.append(r0)
            int r2 = r6.size()
            r1 = 0
        L_0x0063:
            if (r1 >= r2) goto L_0x0076
            if (r1 <= 0) goto L_0x006a
            r3.append(r4)
        L_0x006a:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0073
            A03(r7, r0, r3)
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x0076:
            java.lang.String r0 = "]"
            goto L_0x004a
        L_0x0079:
            A03(r7, r6, r3)
            goto L_0x000e
        L_0x007d:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            goto L_0x008b
        L_0x0084:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 10
        L_0x008b:
            if (r6 != 0) goto L_0x0096
            r0 = 0
        L_0x008e:
            r3.append(r0)
            r3.append(r1)
            goto L_0x000e
        L_0x0096:
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r0)
            goto L_0x008e
        L_0x009b:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.CB0.A00(r3, r6)
            goto L_0x000e
        L_0x00a2:
            r3.append(r4)
            goto L_0x0039
        L_0x00a6:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
        L_0x00ae:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)
            return r0
        L_0x00b3:
            java.lang.String r0 = "{}"
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25821CmY.toString():java.lang.String");
    }
}
