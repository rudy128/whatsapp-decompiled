package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.A8l  reason: case insensitive filesystem */
public abstract class C20126A8l {
    public static final Set A08 = C200410p.A0S(new String[]{"regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low"});
    public static final Set A09 = C200410p.A0S(C17880vN.A1b("critical_block", "critical_unblock_low", 2, 1));
    public C19999A2n A00;
    public byte[] A01 = null;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final C62382rJ A05;
    public final String A06;
    public final String A07;

    public C20126A8l(C62382rJ r2, C19999A2n a2n, String str, String str2, int i, long j, boolean z) {
        this.A04 = j;
        this.A07 = str;
        this.A03 = i;
        this.A00 = a2n;
        this.A05 = r2;
        this.A06 = str2;
        this.A02 = z;
    }

    public final void A0C(boolean z) {
        synchronized (this) {
            this.A02 = z;
        }
    }

    public final boolean A0D() {
        boolean z;
        synchronized (this) {
            z = this.A02;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20126A8l)) {
            return false;
        }
        C20126A8l a8l = (C20126A8l) obj;
        return Arrays.equals(A0F(), a8l.A0F()) && C18070vi.A18(this.A05, a8l.A05) && Arrays.equals(A0E(), a8l.A0E());
    }

    public static void A07(C20126A8l a8l, StringBuilder sb) {
        sb.append(", operation=");
        sb.append(a8l.A05);
        sb.append(", collectionName=");
        sb.append(a8l.A06);
        sb.append(", keyId=");
    }

    public C163398Uv A08() {
        C163398Uv r4 = (C163398Uv) C166378cn.DEFAULT_INSTANCE.A0N();
        long j = this.A04;
        C166378cn A0O = AnonymousClass8BS.A0O(r4);
        A0O.bitField0_ |= 1;
        A0O.timestamp_ = j;
        return r4;
    }

    public String A0A() {
        if (!(this instanceof C170528qA)) {
            return AnonymousClass9QR.A00(A0F());
        }
        String str = ((C170528qA) this).A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[\"removeRecentSticker\",\"");
        A10.append(str);
        return AnonymousClass000.A0y("\"]", A10);
    }

    public String A0B() {
        if (this instanceof C170538qB) {
            return "generated_wui";
        }
        if (this instanceof C170588qG) {
            return "usernameChatStartMode";
        }
        if (this instanceof AnonymousClass8q7) {
            return "setting_unarchiveChats";
        }
        if (this instanceof AnonymousClass8q3) {
            return "status_privacy";
        }
        if (this instanceof C170528qA) {
            return "removeRecentSticker";
        }
        if (this instanceof AnonymousClass8q6) {
            return "setting_pushName";
        }
        if (this instanceof C170548qC) {
            return "primary_version";
        }
        if (this instanceof AnonymousClass8q9) {
            return "setting_locale";
        }
        if (this instanceof C170578qF) {
            return "setting_chatLock";
        }
        if (this instanceof AnonymousClass8q4) {
            return "call_log";
        }
        if (this instanceof C170468pu) {
            return "pin_v1";
        }
        if (this instanceof C170438pr) {
            return "notificationActivitySetting";
        }
        if (this instanceof C170458pt) {
            return "mute";
        }
        if (this instanceof C170448ps) {
            return "lock";
        }
        if (this instanceof C170488pw) {
            return "star";
        }
        if (this instanceof C170478pv) {
            return "deleteMessageForMe";
        }
        if (this instanceof AnonymousClass8q0) {
            return "markChatAsRead";
        }
        if (this instanceof C170508py) {
            return "deleteChat";
        }
        if (this instanceof C170518pz) {
            return "clearChat";
        }
        if (this instanceof AnonymousClass8q1) {
            return "archive";
        }
        if (this instanceof AnonymousClass8q5) {
            return "android_unsupported_actions";
        }
        if (this instanceof AnonymousClass8q8) {
            return "waffle_account_link_state";
        }
        return ((C170558qD) this).A01;
    }

    public String[] A0F() {
        String[] A1Y;
        char c;
        String str;
        if (this instanceof C170538qB) {
            return ((C170538qB) this).A00;
        }
        if (this instanceof C170588qG) {
            return ((C170588qG) this).A01;
        }
        if (this instanceof AnonymousClass8q7) {
            A1Y = C17880vN.A1Y();
            c = 0;
            str = "setting_unarchiveChats";
        } else if (this instanceof AnonymousClass8q3) {
            return ((AnonymousClass8q3) this).A02;
        } else {
            if (this instanceof C170528qA) {
                A1Y = C17880vN.A1Z();
                A1Y[0] = "removeRecentSticker";
                c = 1;
                str = ((C170528qA) this).A01;
            } else if (this instanceof AnonymousClass8q6) {
                A1Y = C17880vN.A1Y();
                c = 0;
                str = "setting_pushName";
            } else if (this instanceof C170548qC) {
                return ((C170548qC) this).A00;
            } else {
                if (this instanceof AnonymousClass8q9) {
                    return ((AnonymousClass8q9) this).A01;
                }
                if (this instanceof C170578qF) {
                    return ((C170578qF) this).A01;
                }
                if (this instanceof AnonymousClass8q4) {
                    return ((AnonymousClass8q4) this).A01;
                }
                if (this instanceof C170468pu) {
                    return ((C170468pu) this).A01;
                }
                if (this instanceof C170438pr) {
                    return ((C170438pr) this).A01;
                }
                if (this instanceof C170458pt) {
                    return ((C170458pt) this).A02;
                }
                if (this instanceof C170448ps) {
                    return ((C170448ps) this).A01;
                }
                if (this instanceof C170488pw) {
                    return ((C170488pw) this).A02;
                }
                if (this instanceof C170478pv) {
                    return ((C170478pv) this).A03;
                }
                if (this instanceof AnonymousClass8q0) {
                    return ((AnonymousClass8q0) this).A01;
                }
                if (this instanceof C170508py) {
                    return ((C170508py) this).A01;
                }
                if (this instanceof C170518pz) {
                    return ((C170518pz) this).A02;
                }
                if (this instanceof AnonymousClass8q1) {
                    return ((AnonymousClass8q1) this).A01;
                }
                if (this instanceof AnonymousClass8q5) {
                    return ((AnonymousClass8q5) this).A00;
                }
                if (this instanceof AnonymousClass8q8) {
                    return ((AnonymousClass8q8) this).A00;
                }
                return ((C170558qD) this).A03;
            }
        }
        A1Y[c] = str;
        return A1Y;
    }

    public static void A00(C170598qH r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.getChatJid());
    }

    public static void A01(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A06);
    }

    public static void A02(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A04);
    }

    public static void A03(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A0D());
    }

    public static void A04(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A05);
    }

    public static void A05(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A07);
    }

    public static void A06(C20126A8l a8l, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(a8l.A00);
    }

    public C166378cn A09() {
        return (C166378cn) A08().A0C();
    }

    public final byte[] A0E() {
        C166378cn A092 = A09();
        if (A092 != null) {
            return A092.A0M();
        }
        return null;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(A0F());
        int hashCode2 = this.A05.hashCode();
        int hashCode3 = Arrays.hashCode(A0E());
        Integer[] numArr = new Integer[3];
        C17880vN.A1T(numArr, hashCode, 0);
        C17880vN.A1T(numArr, hashCode2, 1);
        C17880vN.A1T(numArr, hashCode3, 2);
        return Arrays.hashCode(numArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A05(this, "\n        SyncMutation {\n          rowId='", A10);
        A02(this, "',\n          timestamp=", A10);
        A04(this, ",\n          operation=", A10);
        A01(this, ",\n          collectionName='", A10);
        A10.append("',\n          version=");
        A10.append(this.A03);
        A06(this, ",\n          keyId=", A10);
        A03(this, ",\n          areDependenciesMissing=", A10);
        return AnonymousClass8BW.A0k(",\n        }", A10);
    }
}
