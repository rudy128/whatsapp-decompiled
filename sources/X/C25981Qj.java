package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Qj  reason: invalid class name and case insensitive filesystem */
public class C25981Qj {
    public final AnonymousClass1CJ A00;

    public boolean A00(AnonymousClass206 r7) {
        try {
            if (r7 instanceof C48392Mh) {
                C48392Mh r3 = (C48392Mh) r7;
                C62502rV r0 = r3.A03;
                if (r0 != null) {
                    AnonymousClass1CJ r4 = this.A00;
                    AnonymousClass1BI r2 = r0.A02;
                    C36321nh r02 = GroupJid.Companion;
                    if (r4.A06(C36321nh.A00(r2)) == 1) {
                        return false;
                    }
                }
                int i = r3.A00;
                if (i == 4) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 12) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 127) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 90) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 106) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 124) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 144) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                } else if (i == 143) {
                    if (!"sub_group_suggestion_approved".equals(((AnonymousClass984) r3).A01)) {
                        return false;
                    }
                } else if (i == 149) {
                    if (r3.A00 != 1) {
                        return false;
                    }
                    String A0P = r3.A0P();
                    if (A0P != null) {
                        if (A0P.equals("invite") || A0P.equals("linked_group_join")) {
                            return false;
                        }
                    }
                } else if (i != 145) {
                    return false;
                } else {
                    AnonymousClass1CJ r22 = this.A00;
                    AnonymousClass1BI r1 = r3.A0v.A00;
                    C36321nh r03 = GroupJid.Companion;
                    if (r22.A06(C36321nh.A00(r1)) != 3) {
                        return false;
                    }
                }
            } else if (!(r7 instanceof AnonymousClass2MQ) || !((AnonymousClass2MQ) r7).A02) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("GroupMessageUtils/importantmsg/null ");
            sb.append(AnonymousClass25A.A0D(r7));
            Log.e(sb.toString(), e);
            throw e;
        }
    }

    public C25981Qj(AnonymousClass1CJ r1) {
        this.A00 = r1;
    }
}
