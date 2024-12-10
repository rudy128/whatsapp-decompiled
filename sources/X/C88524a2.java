package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.TypedValue;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;

/* renamed from: X.4a2  reason: invalid class name and case insensitive filesystem */
public class C88524a2 {
    public static JSONArray A0h;
    public C37451pZ A00;
    public final Context A01;
    public final Context A02;
    public final AnonymousClass1GP A03;
    public final C19880zA A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass4P6 A06;
    public final AnonymousClass4Xe A07;
    public final C216416v A08 = ((C216416v) AnonymousClass12Q.A03(C216416v.class));
    public final C51922a3 A09;
    public final C26031Qo A0A;
    public final C18030ve A0B;
    public final AnonymousClass4VE A0C;
    public final C85764Oq A0D;
    public final C26631Sw A0E;
    public final AnonymousClass68H A0F;
    public final AnonymousClass00H A0G;
    public final boolean A0H;
    public final C19880zA A0I;
    public final C19880zA A0J;
    public final AnonymousClass1KB A0K;
    public final C27201Vd A0L;
    public final AnonymousClass5XI A0M;
    public final C63232sj A0N;
    public final AnonymousClass4OU A0O;
    public final C134196qC A0P;
    public final C31131f4 A0Q;
    public final AnonymousClass11P A0R;
    public final C18000vb A0S;
    public final C190559l9 A0T;
    public final C48122Lg A0U;
    public final C25181Nf A0V;
    public final AnonymousClass12B A0W;
    public final AnonymousClass4QD A0X;
    public final C88304Zd A0Y;
    public final C25461Oh A0Z;
    public final AnonymousClass1R2 A0a;
    public final AnonymousClass70H A0b;
    public final C50522Ut A0c;
    public final AnonymousClass129 A0d;
    public final AnonymousClass1DC A0e;
    public final AnonymousClass10I A0f;
    public final AnonymousClass00H A0g;

    public static final int A00(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 13:
                return 11;
            case 14:
                return 12;
            case 15:
                return 13;
            case 16:
                return 14;
            case 19:
                return 15;
            case 20:
                return 16;
            case 21:
                return 17;
            case 22:
                return 18;
            case 23:
                return 19;
            case 24:
                return 20;
            case 25:
                return 21;
            case 26:
                return 22;
            case 27:
                return 23;
            case 28:
                return 24;
            case 29:
                return 25;
            case 30:
                return 26;
            case 31:
                return 27;
            case 32:
                return 28;
            case 36:
                return 29;
            case 37:
                return 30;
            case 42:
                return 31;
            case 43:
                return 32;
            case 44:
                return 33;
            case 45:
                return 34;
            case 46:
                return 35;
            case 49:
                return 36;
            case 51:
                return 37;
            case 52:
                return 38;
            case 54:
                return 39;
            case 55:
                return 40;
            case 57:
                return 41;
            case 62:
                return 42;
            case 63:
                return 43;
            case 66:
                return 44;
            case 72:
                return 45;
            case 73:
                return 46;
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return 47;
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return 48;
            case 81:
                return 49;
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return 50;
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                return 51;
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                return 52;
            case 90:
                return 53;
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                return 54;
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                return 55;
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                return 56;
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                return 57;
            case 95:
                return 58;
            case 96:
                return 59;
            case 97:
                return 60;
            case 99:
                return 61;
            default:
                C17900vP.A0i("ConversationRowInflationTypeMapper/unsupported message type: ", AnonymousClass000.A10(), i);
                break;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: X.21L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: X.23m} */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.3se, X.3uP, X.3uS, X.3uR, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.3uP, X.3uS, X.8nV, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v24, types: [X.3tp, X.3uP, X.3uS, X.3tq] */
    /* JADX WARNING: type inference failed for: r2v99, types: [X.3uP, X.3uS, X.3tr, X.3uR, android.view.View, X.3sv] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02c7, code lost:
        return new X.C23816BqR(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f4, code lost:
        r2.A0J.A01(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03fa, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0460, code lost:
        if (X.C62872s8.A00(r5) == 1) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0471, code lost:
        return new X.C78443so(r4, A04(r4), r1, r5, r6.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0481, code lost:
        return new X.C78393sj(r4, A04(r4), r1, r5, r6.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0617, code lost:
        if (r6.A04.A07() != false) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06b7, code lost:
        r6.A1M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06ba, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07cf, code lost:
        if (r9.A03 != 5) goto L_0x07d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07d6, code lost:
        return new X.AnonymousClass8nY(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x07fd, code lost:
        return new X.C78253sU(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0880, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A01, 4579) != false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0882, code lost:
        r2 = new X.AnonymousClass3uP(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0887, code lost:
        r2.A1M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x088a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0aef, code lost:
        r5 = (X.AnonymousClass210) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0af6, code lost:
        return new X.AnonymousClass3uO(r4, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019c, code lost:
        if (r0 == false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ae, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0B, 4668) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass3uP A01(X.C108875cR r40, X.AnonymousClass206 r41) {
        /*
            r39 = this;
            r5 = r41
            X.205 r8 = r5.A0v
            boolean r3 = r8.A02
            r6 = r39
            if (r3 == 0) goto L_0x002e
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x002e
            android.content.Context r4 = r6.A02
        L_0x0010:
            X.AW0 r9 = X.AnonymousClass25B.A00(r5)
            int r7 = r5.A0u
            r2 = 8
            r1 = r40
            switch(r7) {
                case 0: goto L_0x0565;
                case 1: goto L_0x0536;
                case 2: goto L_0x04d5;
                case 3: goto L_0x0496;
                case 4: goto L_0x0462;
                case 5: goto L_0x0441;
                case 6: goto L_0x001d;
                case 7: goto L_0x0565;
                case 8: goto L_0x001d;
                case 9: goto L_0x0455;
                case 10: goto L_0x03fb;
                case 11: goto L_0x039c;
                case 12: goto L_0x07ca;
                case 13: goto L_0x0394;
                case 14: goto L_0x0472;
                case 15: goto L_0x038c;
                case 16: goto L_0x0380;
                case 17: goto L_0x001d;
                case 18: goto L_0x001d;
                case 19: goto L_0x0378;
                case 20: goto L_0x0362;
                case 21: goto L_0x035c;
                case 22: goto L_0x035c;
                case 23: goto L_0x0353;
                case 24: goto L_0x034c;
                case 25: goto L_0x0342;
                case 26: goto L_0x0338;
                case 27: goto L_0x032e;
                case 28: goto L_0x0324;
                case 29: goto L_0x031a;
                case 30: goto L_0x0310;
                case 31: goto L_0x02d0;
                case 32: goto L_0x0aef;
                case 33: goto L_0x001d;
                case 34: goto L_0x001d;
                case 35: goto L_0x001d;
                case 36: goto L_0x02c8;
                case 37: goto L_0x001d;
                case 38: goto L_0x001d;
                case 39: goto L_0x001d;
                case 40: goto L_0x001d;
                case 41: goto L_0x001d;
                case 42: goto L_0x02b4;
                case 43: goto L_0x02b4;
                case 44: goto L_0x02ac;
                case 45: goto L_0x0190;
                case 46: goto L_0x07d7;
                case 47: goto L_0x001d;
                case 48: goto L_0x001d;
                case 49: goto L_0x0aef;
                case 50: goto L_0x001d;
                case 51: goto L_0x0182;
                case 52: goto L_0x0190;
                case 53: goto L_0x001d;
                case 54: goto L_0x0190;
                case 55: goto L_0x0190;
                case 56: goto L_0x001d;
                case 57: goto L_0x0173;
                case 58: goto L_0x001d;
                case 59: goto L_0x001d;
                case 60: goto L_0x001d;
                case 61: goto L_0x001d;
                case 62: goto L_0x0164;
                case 63: goto L_0x015a;
                case 64: goto L_0x014e;
                case 65: goto L_0x001d;
                case 66: goto L_0x0142;
                case 67: goto L_0x001d;
                case 68: goto L_0x001d;
                case 69: goto L_0x001d;
                case 70: goto L_0x001d;
                case 71: goto L_0x001d;
                case 72: goto L_0x013a;
                case 73: goto L_0x0132;
                case 74: goto L_0x001d;
                case 75: goto L_0x001d;
                case 76: goto L_0x001d;
                case 77: goto L_0x001d;
                case 78: goto L_0x0aac;
                case 79: goto L_0x001d;
                case 80: goto L_0x012a;
                case 81: goto L_0x0122;
                case 82: goto L_0x0102;
                case 83: goto L_0x012a;
                case 84: goto L_0x001d;
                case 85: goto L_0x00f8;
                case 86: goto L_0x001d;
                case 87: goto L_0x001d;
                case 88: goto L_0x001d;
                case 89: goto L_0x001d;
                case 90: goto L_0x00f0;
                case 91: goto L_0x07f8;
                case 92: goto L_0x00d8;
                case 93: goto L_0x001d;
                case 94: goto L_0x00c0;
                case 95: goto L_0x006b;
                case 96: goto L_0x0063;
                case 97: goto L_0x0054;
                case 98: goto L_0x0882;
                case 99: goto L_0x004c;
                case 100: goto L_0x001d;
                case 101: goto L_0x001d;
                case 102: goto L_0x001d;
                case 103: goto L_0x0041;
                case 104: goto L_0x001d;
                case 105: goto L_0x0039;
                case 106: goto L_0x0031;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r2 = r5.A0D()
            r0 = -1
            if (r2 != r0) goto L_0x07f8
            if (r7 != r0) goto L_0x07f8
            X.20i r5 = (X.C436420i) r5
            X.3u1 r2 = new X.3u1
            r2.<init>(r4, r1, r5)
            return r2
        L_0x002e:
            android.content.Context r4 = r6.A01
            goto L_0x0010
        L_0x0031:
            X.24P r5 = (X.AnonymousClass24P) r5
            X.3sh r2 = new X.3sh
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0039:
            X.22i r5 = (X.C441522i) r5
            X.3tR r2 = new X.3tR
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0041:
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.8nS r2 = new X.8nS
            r2.<init>(r4, r1, r5)
            goto L_0x0887
        L_0x004c:
            X.247 r5 = (X.AnonymousClass247) r5
            X.3u5 r2 = new X.3u5
            r2.<init>(r4, r5, r1)
            return r2
        L_0x0054:
            X.1GP r0 = r6.A03
            X.23u r5 = (X.C445323u) r5
            r11 = 0
            X.3tT r6 = new X.3tT
            r7 = r4
            r8 = r0
            r9 = r1
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0063:
            X.23s r5 = (X.C445123s) r5
            X.3sb r2 = new X.3sb
            r2.<init>(r4, r1, r5)
            return r2
        L_0x006b:
            r7 = r5
            X.24J r7 = (X.AnonymousClass24J) r7
            java.lang.Integer r2 = r7.A00
            if (r2 == 0) goto L_0x07f8
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 != r0) goto L_0x07f8
            X.0ve r3 = r6.A0B
            r2 = 6673(0x1a11, float:9.351E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x07f8
            X.11S r0 = r6.A05
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x07f8
            X.3sR r6 = new X.3sR
            r6.<init>(r4, r1, r7)
            r6.A1M()
            X.0ve r1 = r6.A0F
            r0 = 7550(0x1d7e, float:1.058E-41)
            java.lang.String r2 = r1.A0I(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131893421(0x7f121cad, float:1.9421618E38)
            java.lang.String r0 = X.C72473Md.A0j(r1, r2, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r0)
            r6.A28(r2)
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0W(r6, r0)
            r1.setText(r2)
            X.0ve r0 = r6.A0F
            X.AnonymousClass3Ma.A1L(r0, r1)
            return r6
        L_0x00c0:
            X.0ve r3 = r6.A0B
            r2 = 3878(0xf26, float:5.434E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r3, r2)
            r0 = 2
            if (r2 != r0) goto L_0x07f8
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.3sE r2 = new X.3sE
            r2.<init>(r4, r1, r5)
            goto L_0x0887
        L_0x00d8:
            X.0ve r3 = r6.A0B
            r2 = 5563(0x15bb, float:7.795E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x07f8
            X.23z r5 = (X.C445823z) r5
            X.1pZ r0 = r6.A04(r4)
            X.3ty r2 = new X.3ty
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x00f0:
            X.22M r5 = (X.AnonymousClass22M) r5
            X.3sp r2 = new X.3sp
            r2.<init>(r4, r5, r1)
            return r2
        L_0x00f8:
            X.1GP r0 = r6.A03
            X.21l r5 = (X.C439221l) r5
            X.3tH r2 = new X.3tH
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0102:
            X.23m r5 = (X.C444523m) r5
            X.0ve r3 = r6.A0B
            r2 = 2802(0xaf2, float:3.926E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 != 0) goto L_0x0116
            X.3sU r6 = new X.3sU
            r6.<init>(r4, r1, r5)
            return r6
        L_0x0116:
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x02c2
            X.BqN r6 = new X.BqN
            r6.<init>(r4, r1, r5)
            return r6
        L_0x0122:
            X.22c r5 = (X.C440922c) r5
            X.3uH r6 = new X.3uH
            r6.<init>(r4, r1, r5)
            return r6
        L_0x012a:
            X.23j r5 = (X.C444223j) r5
            X.8nW r2 = new X.8nW
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0132:
            X.22z r5 = (X.C443222z) r5
            X.3sc r2 = new X.3sc
            r2.<init>(r4, r1, r5)
            return r2
        L_0x013a:
            X.22x r5 = (X.C443022x) r5
            X.3sl r2 = new X.3sl
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0142:
            X.22H r5 = (X.AnonymousClass22H) r5
            X.1pZ r0 = r6.A04(r4)
            X.3sm r2 = new X.3sm
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x014e:
            X.23N r5 = (X.AnonymousClass23N) r5
            X.C18070vi.A0j(r4, r5)
            X.3tY r2 = new X.3tY
            r2.<init>(r4, r1, r5)
            goto L_0x0887
        L_0x015a:
            X.1GP r0 = r6.A03
            X.21j r5 = (X.C439021j) r5
            X.3t5 r2 = new X.3t5
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0164:
            X.1GP r0 = r6.A03
            X.21a r5 = (X.C438121a) r5
            r11 = 0
            X.3tg r6 = new X.3tg
            r7 = r4
            r8 = r0
            r9 = r1
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0173:
            X.1GP r0 = r6.A03
            X.21e r5 = (X.C438521e) r5
            r11 = 0
            X.3tE r6 = new X.3tE
            r7 = r4
            r8 = r0
            r9 = r1
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0182:
            r0 = r5
            X.21D r0 = (X.AnonymousClass21D) r0
            int r2 = r0.A00
            r0 = 3
            if (r2 != r0) goto L_0x07f8
            X.8nQ r2 = new X.8nQ
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0190:
            X.11S r0 = r6.A05
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x019e
            boolean r0 = X.AnonymousClass25A.A0l(r5)
            if (r0 != 0) goto L_0x01b0
        L_0x019e:
            boolean r0 = X.C20120A8f.A07(r5)
            if (r0 == 0) goto L_0x01b6
            X.0ve r7 = r6.A0B
            r2 = 4668(0x123c, float:6.541E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r2)
            if (r0 != 0) goto L_0x01b6
        L_0x01b0:
            X.3sU r6 = new X.3sU
            r6.<init>(r4, r1, r5)
            return r6
        L_0x01b6:
            boolean r8 = r5 instanceof X.AnonymousClass21K
            if (r8 == 0) goto L_0x0235
            r0 = r5
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r7 = r0.BPK()
            if (r7 == 0) goto L_0x0235
            X.AEY r0 = r7.A03
            if (r0 == 0) goto L_0x0235
            int r2 = r7.A00
            r0 = 10
            if (r2 != r0) goto L_0x0235
            java.lang.String r2 = "payment_info"
            java.lang.String r0 = r7.A00()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0235
            X.21L r5 = (X.AnonymousClass21L) r5
            java.util.HashSet r7 = X.C17880vN.A12()
            X.AEt r0 = r5.A00
            X.AEY r0 = r0.A03
            if (r0 == 0) goto L_0x021e
            java.util.HashSet r7 = X.C17880vN.A12()
            java.util.List r2 = r0.A03
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x021e
            java.util.Iterator r6 = r2.iterator()
        L_0x01f5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x021e
            java.lang.Object r3 = r6.next()
            X.ADj r3 = (X.C20251ADj) r3
            java.lang.String r2 = "pix_static_code"
            java.lang.String r0 = r3.A01
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f5
            X.BDZ r2 = r3.A00
            boolean r0 = r2 instanceof X.C20934Abo
            if (r0 == 0) goto L_0x01f5
            X.Abo r2 = (X.C20934Abo) r2
            boolean r0 = X.A3V.A02(r2)
            if (r0 == 0) goto L_0x01f5
            r0 = 6
            X.C17890vO.A1D(r7, r0)
            goto L_0x01f5
        L_0x021e:
            java.lang.Integer r0 = X.C17880vN.A0m()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x022e
            X.8nU r6 = new X.8nU
            r6.<init>(r4, r1, r5)
            return r6
        L_0x022e:
            java.lang.String r0 = "ConversationRowInflater: getPaymentInfoConversationRow, message type is not supported. Creating a future placeholder message."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01b0
        L_0x0235:
            boolean r0 = X.AnonymousClass25A.A0e(r5)
            if (r0 == 0) goto L_0x0243
            X.21L r5 = (X.AnonymousClass21L) r5
            X.8nT r6 = new X.8nT
            r6.<init>(r4, r1, r5)
            return r6
        L_0x0243:
            if (r3 == 0) goto L_0x029b
            if (r8 == 0) goto L_0x029b
            r0 = r5
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r3 = r0.BPK()
            if (r3 == 0) goto L_0x029b
            java.lang.String r2 = "payment_method"
            java.lang.String r0 = r3.A00()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x029b
            X.206 r2 = r5.A0K()
            boolean r0 = r2 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x027b
            X.21K r2 = (X.AnonymousClass21K) r2
            X.AEt r0 = r2.BPK()
            if (r0 == 0) goto L_0x027b
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x027b
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x027b
        L_0x0274:
            X.3tx r6 = new X.3tx
            r6.<init>(r4, r1, r5)
            goto L_0x06b7
        L_0x027b:
            java.lang.String r2 = r3.A01()
            r3 = 0
            if (r2 == 0) goto L_0x029b
            int r0 = r2.length()
            if (r0 == 0) goto L_0x029b
            org.json.JSONObject r2 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x0295 }
            java.lang.String r0 = "share_payment_status"
            boolean r0 = r2.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0295 }
            if (r0 == 0) goto L_0x029b
            goto L_0x0274
        L_0x0295:
            r2 = move-exception
            java.lang.String r0 = "CheckoutInfoContentParser/isSharePaymentStatus failed to parse parameters json"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x029b:
            X.1GP r2 = r6.A03
            X.16v r0 = r6.A08
            X.21L r5 = (X.AnonymousClass21L) r5
            X.3uC r6 = new X.3uC
            r7 = r4
            r8 = r2
            r9 = r1
            r10 = r0
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x02ac:
            X.22U r5 = (X.AnonymousClass22U) r5
            X.3sn r2 = new X.3sn
            r2.<init>(r4, r1, r5)
            return r2
        L_0x02b4:
            X.21V r5 = (X.AnonymousClass21V) r5
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x02c2
            X.BqP r6 = new X.BqP
            r6.<init>(r4, r1, r5)
            return r6
        L_0x02c2:
            X.BqR r6 = new X.BqR
            r6.<init>(r4, r1, r5)
            return r6
        L_0x02c8:
            X.22v r5 = (X.C442822v) r5
            X.3sg r2 = new X.3sg
            r2.<init>(r4, r1, r5)
            return r2
        L_0x02d0:
            if (r9 != 0) goto L_0x07d1
            X.129 r3 = r6.A0d
            X.3sQ r2 = new X.3sQ
            r2.<init>(r4, r1, r5)
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            com.whatsapp.TextEmojiLabel r7 = X.AnonymousClass3MX.A0W(r2, r0)
            X.0ve r0 = r2.A0F
            boolean r6 = X.C72483Me.A1A(r7, r0)
            r7.setLongClickable(r6)
            java.lang.String r0 = "835452491239734"
            java.lang.String r4 = r3.A06(r0)
            android.content.Context r3 = r2.getContext()
            r1 = 2131889226(0x7f120c4a, float:1.941311E38)
            r0 = 1
            java.lang.String r0 = X.C17890vO.A0R(r3, r4, r0, r6, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r2.A28(r1)
            X.11C r0 = r2.A0C
            X.AnonymousClass3Ma.A1K(r7, r0)
            r7.setText(r1)
            goto L_0x03f4
        L_0x0310:
            X.220 r5 = (X.AnonymousClass220) r5
            X.1GP r0 = r6.A03
            X.3tG r2 = new X.3tG
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x031a:
            X.21u r5 = (X.C440121u) r5
            X.1GP r0 = r6.A03
            X.3t8 r2 = new X.3t8
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0324:
            X.21w r5 = (X.C440321w) r5
            X.1GP r0 = r6.A03
            X.3tf r2 = new X.3tf
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x032e:
            X.21o r5 = (X.C439521o) r5
            X.1GP r0 = r6.A03
            X.3si r2 = new X.3si
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0338:
            X.222 r5 = (X.AnonymousClass222) r5
            X.1GP r0 = r6.A03
            X.3t4 r2 = new X.3t4
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0342:
            X.21y r5 = (X.C440521y) r5
            X.1GP r0 = r6.A03
            X.3uB r2 = new X.3uB
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x034c:
            X.3sF r2 = new X.3sF
            r2.<init>(r4, r1, r5)
            goto L_0x0887
        L_0x0353:
            X.22Q r5 = (X.AnonymousClass22Q) r5
            r0 = 0
            X.3uG r2 = new X.3uG
            r2.<init>(r4, r1, r5, r0)
            return r2
        L_0x035c:
            X.3sf r2 = new X.3sf
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0362:
            if (r9 != 0) goto L_0x07d1
            X.22g r5 = (X.C441322g) r5
            X.70H r3 = r6.A0b
            X.1Sw r2 = r6.A0E
            X.2Ut r0 = r6.A0c
            X.3tQ r8 = new X.3tQ
            r9 = r4
            r10 = r1
            r11 = r5
            r12 = r3
            r13 = r2
            r14 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0378:
            X.21r r5 = (X.C439821r) r5
            X.3sW r2 = new X.3sW
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0380:
            X.219 r5 = (X.AnonymousClass219) r5
            X.1pZ r0 = r6.A04(r4)
            X.3uD r2 = new X.3uD
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x038c:
            X.23N r5 = (X.AnonymousClass23N) r5
            X.3uN r2 = new X.3uN
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0394:
            X.21t r5 = (X.C440021t) r5
            X.3u2 r6 = new X.3u2
            r6.<init>(r4, r1, r5)
            return r6
        L_0x039c:
            if (r9 != 0) goto L_0x07d1
            X.10I r2 = r6.A0f
            r0 = 17
            X.C98814rl.A00(r2, r6, r5, r0)
            X.129 r3 = r6.A0d
            X.3sP r2 = new X.3sP
            r2.<init>(r4, r1, r5)
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            com.whatsapp.TextEmojiLabel r7 = X.AnonymousClass3MX.A0W(r2, r0)
            X.0ve r0 = r2.A0F
            boolean r6 = X.C72483Me.A1A(r7, r0)
            r7.setLongClickable(r6)
            java.lang.String r0 = "26000015"
            java.lang.String r4 = r3.A06(r0)
            android.content.Context r3 = r2.getContext()
            r1 = 2131889226(0x7f120c4a, float:1.941311E38)
            r0 = 1
            java.lang.String r0 = X.C17890vO.A0R(r3, r4, r0, r6, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
            r2.A28(r1)
            X.11C r0 = r2.A0C
            X.AnonymousClass3Ma.A1K(r7, r0)
            r7.setText(r1)
            X.0z4 r0 = r2.A0v
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            java.lang.String r3 = "decryption_failure_views"
            int r0 = r0.getInt(r3, r6)
            X.0z4 r1 = r2.A0v
            int r0 = r0 + 1
            X.C17900vP.A0M(r1, r3, r0)
        L_0x03f4:
            X.1ni r1 = r2.A0J
            r0 = 2
            r1.A01(r5, r0)
            return r2
        L_0x03fb:
            X.3sv r2 = new X.3sv
            r2.<init>(r4, r1, r5)
            r2.A1M()
            r0 = 2131431625(0x7f0b10c9, float:1.8484984E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r2, r0)
            r2.A00 = r1
            float r0 = r2.getDividerFontSize()
            r1.setTextSize(r0)
            r2.A1M()
            r5 = 0
            r2.setClickable(r5)
            android.widget.TextView r3 = r2.A00
            X.5bZ r0 = r2.A09
            android.graphics.drawable.Drawable r0 = r0.BQF()
            r3.setBackground(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166272(0x7f070440, float:1.7946785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setCompoundDrawablePadding(r0)
            X.AnonymousClass3uP.A0W(r3, r2)
            r0 = 1
            r2.setLongClickable(r0)
            r2.setWillNotDraw(r5)
            r2.A2i()
            return r2
        L_0x0441:
            boolean r0 = r5.A0z(r2)
            X.21B r5 = (X.AnonymousClass21B) r5
            if (r0 == 0) goto L_0x044f
            X.3tI r2 = new X.3tI
            r2.<init>(r4, r1, r5)
            return r2
        L_0x044f:
            X.3uE r2 = new X.3uE
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0455:
            boolean r0 = X.A3I.A02(r5)
            if (r0 == 0) goto L_0x0482
            int r2 = X.C62872s8.A00(r5)
            r0 = 1
            if (r2 != r0) goto L_0x0472
        L_0x0462:
            X.1pZ r8 = r6.A04(r4)
            X.68H r0 = r6.A0F
            X.3so r6 = new X.3so
            r7 = r4
            r9 = r1
            r10 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0472:
            X.1pZ r8 = r6.A04(r4)
            X.68H r0 = r6.A0F
            X.3sj r6 = new X.3sj
            r7 = r4
            r9 = r1
            r10 = r5
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0482:
            boolean r0 = r5.A0z(r2)
            X.21i r5 = (X.C438921i) r5
            if (r0 == 0) goto L_0x0490
            X.3t6 r2 = new X.3t6
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0490:
            X.3tw r2 = new X.3tw
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0496:
            boolean r0 = r5.A0z(r2)
            if (r0 == 0) goto L_0x04a4
            X.21Y r5 = (X.AnonymousClass21Y) r5
            X.3te r2 = new X.3te
            r2.<init>(r4, r1, r5)
            return r2
        L_0x04a4:
            r7 = r5
            X.21Y r7 = (X.AnonymousClass21Y) r7
            X.0ve r6 = r6.A0B
            boolean r0 = X.AnonymousClass72Z.A01(r6, r7)
            if (r0 != 0) goto L_0x04cf
            if (r3 != 0) goto L_0x04cf
            X.1BI r0 = r8.A00
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 == 0) goto L_0x04c3
            r2 = 1844(0x734, float:2.584E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r2)
            if (r0 != 0) goto L_0x04cf
        L_0x04c3:
            int r2 = r5.A09
            r0 = 14
            if (r2 == r0) goto L_0x04cf
            X.3tP r2 = new X.3tP
            r2.<init>(r4, r1, r7)
            return r2
        L_0x04cf:
            X.3uK r2 = new X.3uK
            r2.<init>(r4, r1, r7)
            return r2
        L_0x04d5:
            r3 = r5
            X.22l r3 = (X.C441822l) r3
            boolean r0 = r5.A0w()
            if (r0 != 0) goto L_0x051e
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r5)
            if (r0 != 0) goto L_0x051e
            X.0ve r5 = r6.A0B
            r2 = 1040(0x410, float:1.457E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r2)
            if (r0 == 0) goto L_0x0509
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L_0x050f
        L_0x04f6:
            X.1pZ r8 = r6.A04(r4)
            X.6qC r2 = r6.A0P
            X.1f4 r0 = r6.A0Q
            X.BqW r6 = new X.BqW
            r7 = r4
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0509:
            int r2 = r3.A09
            r0 = 1
            if (r2 != r0) goto L_0x050f
            goto L_0x04f6
        L_0x050f:
            X.6qC r2 = r6.A0P
            X.1f4 r0 = r6.A0Q
            X.BqX r6 = new X.BqX
            r7 = r4
            r8 = r1
            r9 = r2
            r10 = r0
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x051e:
            X.1pZ r5 = r6.A04(r4)
            X.6qC r2 = r6.A0P
            X.1f4 r0 = r6.A0Q
            X.C18070vi.A0w(r4, r3, r5, r2, r0)
            X.BqT r6 = new X.BqT
            r7 = r4
            r8 = r5
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x06b7
        L_0x0536:
            boolean r0 = r5.A0z(r2)
            if (r0 == 0) goto L_0x0544
            X.21d r5 = (X.C438421d) r5
            X.3tD r2 = new X.3tD
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0544:
            X.0zA r2 = r6.A0I
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x055d
            r2.A03()
            boolean r0 = X.C87494Vu.A00(r5)
            if (r0 == 0) goto L_0x055d
            X.21d r5 = (X.C438421d) r5
            X.3tC r2 = new X.3tC
            r2.<init>(r4, r1, r5)
            return r2
        L_0x055d:
            X.21d r5 = (X.C438421d) r5
            X.3u3 r2 = new X.3u3
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0565:
            boolean r0 = r5 instanceof X.C436420i
            if (r0 == 0) goto L_0x06f4
            r7 = r5
            X.20i r7 = (X.C436420i) r7
            int r2 = r7.A00
            if (r3 == 0) goto L_0x0580
            r0 = 6
            if (r2 != r0) goto L_0x0580
            r0 = r5
            X.2MP r0 = (X.AnonymousClass2MP) r0
            com.whatsapp.data.ProfilePhotoChange r0 = r0.A00
            if (r0 == 0) goto L_0x081a
            X.3t3 r2 = new X.3t3
            r2.<init>(r4, r1, r7)
            return r2
        L_0x0580:
            r0 = 41
            if (r2 == r0) goto L_0x06ee
            r0 = 40
            if (r2 == r0) goto L_0x06ee
            r0 = 42
            if (r2 == r0) goto L_0x06ee
            r0 = 64
            if (r2 == r0) goto L_0x06ee
            r0 = 65
            if (r2 == r0) goto L_0x06ee
            r0 = 66
            if (r2 == r0) goto L_0x06ee
            r0 = 68
            if (r2 != r0) goto L_0x05a4
            X.2M9 r5 = (X.AnonymousClass2M9) r5
            X.3sZ r2 = new X.3sZ
            r2.<init>(r4, r1, r5)
            return r2
        L_0x05a4:
            r0 = 76
            if (r2 != r0) goto L_0x05ae
            X.3sY r2 = new X.3sY
            r2.<init>(r4, r1, r7)
            return r2
        L_0x05ae:
            r0 = 80
            if (r2 != r0) goto L_0x05c2
            X.1GP r2 = r6.A03
            X.4QD r0 = r6.A0X
            X.3sX r6 = new X.3sX
            r8 = r6
            r9 = r4
            r10 = r2
            r11 = r1
            r12 = r0
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            return r6
        L_0x05c2:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L_0x05cc
            X.3sV r2 = new X.3sV
            r2.<init>(r4, r1, r7)
            return r2
        L_0x05cc:
            r0 = 67
            if (r2 != r0) goto L_0x060d
            X.0zA r0 = r6.A04
            java.lang.Object r9 = r0.A04()
            X.1Ps r9 = (X.C25811Ps) r9
            X.1BI r2 = r8.A00
            if (r2 == 0) goto L_0x060b
            X.1Nf r0 = r6.A0V
            X.1E7 r3 = r0.A01(r2)
        L_0x05e2:
            X.0ve r2 = r6.A0B
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            if (r9 == 0) goto L_0x061a
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r9.A0D(r0)
            if (r0 == 0) goto L_0x061a
            boolean r0 = r7 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x061a
            r0 = r7
            X.2MC r0 = (X.AnonymousClass2MC) r0
            int r2 = r0.A00
            r0 = 15
            if (r2 != r0) goto L_0x061a
        L_0x0601:
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.3t2 r2 = new X.3t2
            r2.<init>(r4, r1, r7)
            return r2
        L_0x060b:
            r3 = 0
            goto L_0x05e2
        L_0x060d:
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0643
            X.0zA r0 = r6.A04
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x081a
            goto L_0x0601
        L_0x061a:
            if (r3 == 0) goto L_0x0629
            int r2 = r3.A03
            r0 = 1
            if (r2 != r0) goto L_0x0629
            X.0zA r0 = r6.A0J
            X.3sT r2 = new X.3sT
            r2.<init>(r4, r0, r1, r5)
            return r2
        L_0x0629:
            X.3u1 r2 = new X.3u1
            r2.<init>(r4, r1, r7)
            X.00H r0 = r2.A0P
            java.lang.Object r4 = r0.get()
            X.9fq r4 = (X.C187459fq) r4
            X.10I r3 = r4.A04
            r1 = 31
            X.Ak0 r0 = new X.Ak0
            r0.<init>(r7, r4, r1)
            r3.CGF(r0)
            return r2
        L_0x0643:
            r0 = 96
            if (r2 != r0) goto L_0x0667
            X.3u1 r2 = new X.3u1
            r2.<init>(r4, r1, r7)
            android.content.Context r1 = r2.getContext()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r0 = X.AnonymousClass1L9.A01(r1, r0)
            X.01C r0 = (X.AnonymousClass01C) r0
            X.1It r1 = X.AnonymousClass3MW.A0N(r0)
            java.lang.Class<com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel> r0 = com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r0 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r0
            r2.A0A = r0
            return r2
        L_0x0667:
            r0 = 129(0x81, float:1.81E-43)
            if (r2 != r0) goto L_0x081a
            X.1Nf r2 = r6.A0V
            X.1BI r0 = r8.A00
            X.1E7 r2 = r2.A01(r0)
            X.9l9 r0 = r6.A0T
            X.5Zc r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0693
            boolean r0 = r0.Bfv()
            if (r0 == 0) goto L_0x0693
            X.0vb r3 = r6.A0S
            X.2Lg r2 = r6.A0U
            X.4OU r0 = r6.A0O
            X.3sy r8 = new X.3sy
            r9 = r4
            r10 = r1
            r11 = r0
            r12 = r3
            r13 = r2
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0693:
            android.content.Context r4 = r6.A01
            X.4VE r8 = r6.A0C
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x06e3
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x06a5
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x06e3
        L_0x06a5:
            java.lang.String r0 = "ConversationRowInflater: getFmxConversationRow, FMX message type is supported"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2lf r0 = r2.A0H
            if (r0 == 0) goto L_0x06bb
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.3u0 r6 = new X.3u0
            r6.<init>(r4, r1, r7)
        L_0x06b7:
            r6.A1M()
            return r6
        L_0x06bb:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x06dd
            X.1yf r0 = r2.A0G
            if (r0 == 0) goto L_0x06d3
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x06d3
            X.1Qo r3 = r6.A0A
            X.3xE r2 = X.C80473xE.A00
            r0 = 0
            r3.A00(r2, r0)
        L_0x06d3:
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.3t7 r6 = new X.3t7
            r6.<init>(r4, r1, r8, r7)
            return r6
        L_0x06dd:
            X.3tz r6 = new X.3tz
            r6.<init>(r4, r1, r8, r7)
            return r6
        L_0x06e3:
            java.lang.String r0 = "ConversationRowInflater: getFmxConversationRow, FMX message type is not supported. Creating a future placeholder message."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3sU r6 = new X.3sU
            r6.<init>(r4, r1, r5)
            return r6
        L_0x06ee:
            X.3uF r2 = new X.3uF
            r2.<init>(r4, r1, r7)
            return r2
        L_0x06f4:
            if (r9 != 0) goto L_0x07d1
            boolean r0 = r5.A0z(r2)
            if (r0 == 0) goto L_0x0704
            X.210 r5 = (X.AnonymousClass210) r5
            X.3sd r2 = new X.3sd
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0704:
            X.2sj r0 = r6.A0N
            boolean r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x074b
            X.0ve r3 = r6.A0B
            r2 = 7268(0x1c64, float:1.0185E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0743
            X.36i r0 = X.AnonymousClass2UX.A00(r5)
            if (r0 == 0) goto L_0x0743
            X.9Ic r0 = r0.A01
            if (r0 == 0) goto L_0x0743
            boolean r0 = r6.A02(r5)
            if (r0 == 0) goto L_0x073b
            android.content.Context r0 = r6.A01
            X.210 r5 = (X.AnonymousClass210) r5
            X.C18070vi.A0j(r0, r5)
            X.3tp r2 = new X.3tp
            r2.<init>(r0, r1, r5)
            r2.A1M()
            r2.A2t()
            return r2
        L_0x073b:
            X.210 r5 = (X.AnonymousClass210) r5
            X.3to r2 = new X.3to
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0743:
            X.210 r5 = (X.AnonymousClass210) r5
            X.3tn r2 = new X.3tn
            r2.<init>(r4, r1, r5)
            return r2
        L_0x074b:
            X.0zA r2 = r6.A0I
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0784
            r2.A03()
            boolean r0 = X.C87494Vu.A00(r5)
            if (r0 == 0) goto L_0x0784
            X.0ve r3 = r6.A0B
            X.0vf r2 = X.C18040vf.A01
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x077c
            r0 = 12668(0x317c, float:1.7752E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x077c
            X.210 r5 = (X.AnonymousClass210) r5
            X.C18070vi.A0j(r4, r5)
            X.3st r2 = new X.3st
            r2.<init>(r4, r1, r5)
            goto L_0x0887
        L_0x077c:
            X.210 r5 = (X.AnonymousClass210) r5
            X.3tq r2 = new X.3tq
            r2.<init>(r4, r1, r5)
            return r2
        L_0x0784:
            boolean r0 = X.AnonymousClass25A.A0t(r5)
            if (r0 == 0) goto L_0x07b4
            X.00H r0 = r6.A0g
            java.lang.Object r2 = r0.get()
            X.1i4 r2 = (X.C32981i4) r2
            r7 = r5
            X.210 r7 = (X.AnonymousClass210) r7
            java.lang.String r0 = r7.A07
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x07b4
            X.0ve r3 = r6.A0B
            r2 = 10630(0x2986, float:1.4896E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x07b4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.3ts r2 = new X.3ts
            r2.<init>(r4, r1, r7)
            goto L_0x0887
        L_0x07b4:
            X.0ve r3 = r6.A0B
            X.1Oh r2 = r6.A0Z
            X.210 r5 = (X.AnonymousClass210) r5
            java.lang.String r0 = r5.A0P()
            boolean r0 = X.C26180Cu0.A02(r3, r2, r0)
            if (r0 == 0) goto L_0x0af1
            X.3uI r2 = new X.3uI
            r2.<init>(r4, r1, r5)
            return r2
        L_0x07ca:
            if (r9 == 0) goto L_0x07f8
            int r2 = r9.A03
            r0 = 5
            if (r2 == r0) goto L_0x07f8
        L_0x07d1:
            X.8nY r2 = new X.8nY
            r2.<init>(r4, r1, r5)
            return r2
        L_0x07d7:
            X.11S r0 = r6.A05
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x07fe
            boolean r0 = r5 instanceof X.C438721g
            if (r0 == 0) goto L_0x07fe
            r0 = r5
            X.21g r0 = (X.C438721g) r0
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x07fe
            X.AE2 r0 = r0.A01
            if (r0 == 0) goto L_0x07fe
            java.lang.String r2 = r0.A01
            java.lang.String r0 = "galaxy_message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x07fe
        L_0x07f8:
            X.3sU r2 = new X.3sU
            r2.<init>(r4, r1, r5)
            return r2
        L_0x07fe:
            X.0ve r9 = r6.A0B
            boolean r0 = r5 instanceof X.C438721g
            if (r0 == 0) goto L_0x0a3a
            r0 = r5
            X.21g r0 = (X.C438721g) r0
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x0a3a
            X.AE2 r0 = r0.A01
            if (r0 == 0) goto L_0x0a3a
            java.lang.String r2 = r0.A01
            java.lang.String r0 = "call_permission_request"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0a3a
            goto L_0x0882
        L_0x081a:
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 124(0x7c, float:1.74E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 144(0x90, float:2.02E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 139(0x8b, float:1.95E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 148(0x94, float:2.07E-43)
            if (r2 == r0) goto L_0x089b
            r0 = 149(0x95, float:2.09E-43)
            if (r2 == r0) goto L_0x089b
            X.4Zd r3 = r6.A0Y
            boolean r0 = r3.A03(r7)
            if (r0 != 0) goto L_0x089b
            boolean r0 = r3.A02(r7)
            if (r0 != 0) goto L_0x089b
            boolean r0 = r3.A04(r7)
            if (r0 != 0) goto L_0x089b
            r0 = 11
            if (r2 != r0) goto L_0x088b
            X.11S r2 = r3.A00
            X.1BI r0 = r7.A0H()
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x0895
            boolean r0 = X.C88304Zd.A01(r3, r7)
            if (r0 == 0) goto L_0x0895
            X.0ve r3 = r3.A01
            r2 = 4579(0x11e3, float:6.417E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0895
        L_0x0882:
            X.3tx r2 = new X.3tx
            r2.<init>(r4, r1, r5)
        L_0x0887:
            r2.A1M()
            return r2
        L_0x088b:
            r0 = 154(0x9a, float:2.16E-43)
            if (r2 != r0) goto L_0x0895
            X.3sq r2 = new X.3sq
            r2.<init>(r4, r1, r7)
            return r2
        L_0x0895:
            X.3u1 r2 = new X.3u1
            r2.<init>(r4, r1, r7)
            return r2
        L_0x089b:
            X.5XI r2 = r6.A0M
            android.content.Context r0 = r6.A01
            r38 = r0
            X.4kn r2 = (X.C94544kn) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0994
            java.lang.Object r0 = r2.A01
            X.10H r0 = (X.AnonymousClass10H) r0
            X.10E r3 = r0.A00
            X.11t r18 = X.AnonymousClass10E.A48(r3)
            X.00S r0 = r3.AAo
            java.lang.Object r15 = r0.get()
            X.1gn r15 = (X.C32191gn) r15
            X.1kb r17 = X.AnonymousClass3MZ.A0b(r3)
            X.0ve r35 = X.AnonymousClass10E.A8r(r3)
            X.1Vd r20 = X.AnonymousClass3MZ.A0i(r3)
            X.1M9 r19 = X.AnonymousClass10E.A4z(r3)
            X.00S r0 = r3.A4l
            java.lang.Object r14 = r0.get()
            X.4Zd r14 = (X.C88304Zd) r14
            X.10G r0 = r3.A00
            X.00S r2 = r0.AAX
            java.lang.Object r13 = r2.get()
            X.5ZN r13 = (X.AnonymousClass5ZN) r13
            X.1Nf r34 = X.AnonymousClass3MZ.A0m(r3)
            X.00S r2 = r0.AAY
            java.lang.Object r12 = r2.get()
            X.5ZP r12 = (X.AnonymousClass5ZP) r12
            X.00S r2 = r0.AAd
            java.lang.Object r11 = r2.get()
            X.5XP r11 = (X.AnonymousClass5XP) r11
            X.00S r2 = r0.AAf
            java.lang.Object r10 = r2.get()
            X.5XM r10 = (X.AnonymousClass5XM) r10
            X.00S r2 = r0.AAg
            java.lang.Object r9 = r2.get()
            X.5ZO r9 = (X.AnonymousClass5ZO) r9
            X.00S r2 = r0.AAj
            java.lang.Object r8 = r2.get()
            X.5XO r8 = (X.AnonymousClass5XO) r8
            X.00S r2 = r0.AAl
            java.lang.Object r6 = r2.get()
            X.5XQ r6 = (X.AnonymousClass5XQ) r6
            X.00S r2 = r0.AAp
            java.lang.Object r5 = r2.get()
            X.5ZR r5 = (X.AnonymousClass5ZR) r5
            X.00S r2 = r0.AAq
            java.lang.Object r4 = r2.get()
            X.5XV r4 = (X.AnonymousClass5XV) r4
            X.00S r2 = r0.AAs
            java.lang.Object r3 = r2.get()
            X.5XT r3 = (X.AnonymousClass5XT) r3
            X.00S r2 = r0.AAt
            java.lang.Object r2 = r2.get()
            X.5XX r2 = (X.AnonymousClass5XX) r2
            X.00S r0 = r0.AAu
        L_0x094b:
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.5ZU r0 = (X.AnonymousClass5ZU) r0
            r16 = r0
            X.4aK r0 = new X.4aK
            r28 = r6
            r29 = r5
            r30 = r3
            r31 = r16
            r32 = r4
            r33 = r2
            r36 = r14
            r37 = r7
            r22 = r13
            r23 = r9
            r24 = r12
            r25 = r10
            r26 = r8
            r27 = r11
            r16 = r15
            r21 = r1
            r14 = r0
            r15 = r38
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            android.content.Context r7 = r0.A05
            X.20i r1 = r0.A09
            X.5cR r13 = r0.A07
            X.5ZE r10 = r0.A02
            X.5ZH r12 = r0.A04
            X.5ZF r11 = r0.A03
            X.5ZC r8 = r0.A00
            X.5ZD r9 = r0.A01
            X.3tv r6 = new X.3tv
            r14 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
        L_0x0994:
            java.lang.Object r2 = r2.A01
            X.1K2 r2 = (X.AnonymousClass1K2) r2
            X.10E r3 = r2.A01
            X.11t r18 = X.AnonymousClass10E.A48(r3)
            X.00S r0 = r3.AAo
            java.lang.Object r15 = r0.get()
            X.1gn r15 = (X.C32191gn) r15
            X.1kb r17 = X.AnonymousClass3MZ.A0b(r3)
            X.0ve r35 = X.AnonymousClass10E.A8r(r3)
            X.1Vd r20 = X.AnonymousClass3MZ.A0i(r3)
            X.1M9 r19 = X.AnonymousClass10E.A4z(r3)
            X.00S r0 = r3.A4l
            java.lang.Object r14 = r0.get()
            X.4Zd r14 = (X.C88304Zd) r14
            X.1K1 r0 = r2.A00
            X.00S r2 = r0.A77
            java.lang.Object r13 = r2.get()
            X.5ZN r13 = (X.AnonymousClass5ZN) r13
            X.1Nf r34 = X.AnonymousClass3MZ.A0m(r3)
            X.00S r2 = r0.A78
            java.lang.Object r12 = r2.get()
            X.5ZP r12 = (X.AnonymousClass5ZP) r12
            X.00S r2 = r0.A7C
            java.lang.Object r11 = r2.get()
            X.5XP r11 = (X.AnonymousClass5XP) r11
            X.00S r2 = r0.A7E
            java.lang.Object r10 = r2.get()
            X.5XM r10 = (X.AnonymousClass5XM) r10
            X.00S r2 = r0.A7F
            java.lang.Object r9 = r2.get()
            X.5ZO r9 = (X.AnonymousClass5ZO) r9
            X.00S r2 = r0.A7J
            java.lang.Object r8 = r2.get()
            X.5XO r8 = (X.AnonymousClass5XO) r8
            X.00S r2 = r0.A7L
            java.lang.Object r6 = r2.get()
            X.5XQ r6 = (X.AnonymousClass5XQ) r6
            X.00S r2 = r0.A7P
            java.lang.Object r5 = r2.get()
            X.5ZR r5 = (X.AnonymousClass5ZR) r5
            X.00S r2 = r0.A7Q
            java.lang.Object r4 = r2.get()
            X.5XV r4 = (X.AnonymousClass5XV) r4
            X.00S r2 = r0.A7S
            java.lang.Object r3 = r2.get()
            X.5XT r3 = (X.AnonymousClass5XT) r3
            X.00S r2 = r0.A7T
            java.lang.Object r2 = r2.get()
            X.5XX r2 = (X.AnonymousClass5XX) r2
            X.00S r0 = r0.A7U
            goto L_0x094b
        L_0x0a3a:
            r8 = r5
            X.21g r8 = (X.C438721g) r8
            X.AEb r7 = r8.A00
            if (r7 == 0) goto L_0x0aef
            X.9Je r2 = X.AnonymousClass9Je.EXTENSIONS_1
            X.9Je r0 = r7.A00
            if (r2 != r0) goto L_0x0aef
            boolean r0 = r7.A01(r9, r3)
            if (r0 == 0) goto L_0x0ab2
            android.content.Context r2 = r6.A01
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.8nV r6 = new X.8nV
            r6.<init>(r2, r1, r8)
            r6.A1M()
            r0 = 2131430919(0x7f0b0e07, float:1.8483553E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r6, r0)
            r6.A03 = r0
            r0 = 2131430918(0x7f0b0e06, float:1.848355E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r6, r0)
            r6.A02 = r0
            r0 = 2131430916(0x7f0b0e04, float:1.8483546E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r6, r0)
            r6.A04 = r0
            r0 = 2131430914(0x7f0b0e02, float:1.8483542E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0C(r6, r0)
            r6.A00 = r0
            r0 = 2131430920(0x7f0b0e08, float:1.8483555E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r6, r0)
            r6.A01 = r0
            X.AnonymousClass8nV.A01(r6)
            android.view.ViewGroup r1 = r6.A00
            if (r1 == 0) goto L_0x0a94
            r0 = 34
            X.C89904dD.A00(r1, r6, r0)
        L_0x0a94:
            android.widget.TextView r1 = r6.A01
            if (r1 == 0) goto L_0x0a9d
            r0 = 35
            X.C89904dD.A00(r1, r6, r0)
        L_0x0a9d:
            android.view.ViewGroup r0 = r6.A00
            if (r0 == 0) goto L_0x0aa4
            X.AnonymousClass3uP.A0W(r0, r6)
        L_0x0aa4:
            android.widget.TextView r0 = r6.A01
            if (r0 == 0) goto L_0x0ab1
            X.AnonymousClass3uP.A0W(r0, r6)
            return r6
        L_0x0aac:
            X.3sU r6 = new X.3sU
            r6.<init>(r4, r1, r5)
        L_0x0ab1:
            return r6
        L_0x0ab2:
            X.3se r6 = new X.3se
            r6.<init>(r4, r1, r8)
            r6.A1M()
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0V(r6, r0)
            r6.A00 = r1
            X.0ve r0 = r6.A0F
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r1 = 0
            r0.setAutoLinkMask(r1)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r0.setLinksClickable(r1)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r0.setFocusable(r1)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r0.setClickable(r1)
            com.whatsapp.TextEmojiLabel r0 = r6.A00
            r0.setLongClickable(r1)
            com.whatsapp.TextEmojiLabel r1 = r6.A00
            int r0 = r6.getSecondaryTextColor()
            r1.setTextColor(r0)
            X.C78343se.A01(r6)
            return r6
        L_0x0aef:
            X.210 r5 = (X.AnonymousClass210) r5
        L_0x0af1:
            X.3uO r2 = new X.3uO
            r2.<init>(r4, r1, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88524a2.A01(X.5cR, X.206):X.3uP");
    }

    public C37451pZ A04(Context context) {
        C37451pZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C37451pZ A062 = this.A0L.A06(context, "conversation-row-inflater");
        this.A00 = A062;
        return A062;
    }

    public AnonymousClass3uP A05(C108875cR r12, AnonymousClass206 r13) {
        C85764Oq r5 = this.A0D;
        if (!r5.A05) {
            return A01(r12, r13);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass3uP A012 = A01(r12, r13);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        int i = r13.A0u;
        int A002 = A00(i);
        if (r5.A05) {
            r5.A02.add(new C86964Tt(elapsedRealtime2, A002));
            if (elapsedRealtime2 > ((long) C18020vd.A00(C18040vf.A02, this.A0B, 8258))) {
                C51922a3 r0 = this.A09;
                C17890vO.A0r(r0.A00, new C95734mi(elapsedRealtime2, A00(i), r13.A0x), 21);
            }
        }
        return A012;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.3tp, X.3uP, X.3uS, X.3tq] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.3u4, X.3u7, X.3uP, X.3uS] */
    public AnonymousClass3uP A06(C108875cR r5, AnonymousClass206 r6, Integer num) {
        Context context;
        if (num == AnonymousClass00R.A00) {
            return A05(r5, r6);
        }
        if (!r6.A0v.A02 || !this.A0H) {
            context = this.A01;
        } else {
            context = this.A02;
        }
        if (num == AnonymousClass00R.A01) {
            if (r6 instanceof AnonymousClass21V) {
                int i = r6.A0u;
                AnonymousClass21V r62 = (AnonymousClass21V) r6;
                if (i == 20) {
                    return new C79073uJ(context, r5, r62, this.A0E);
                }
                C18070vi.A0j(context, r62);
                ? r1 = new AnonymousClass3u7(context, r5, r62);
                r1.A1M();
                r1.A00 = C18460wS.A00;
                return r1;
            }
            C19880zA r12 = this.A04;
            if (r12.A07() && ((C25811Ps) r12.A03()).A0F(r6)) {
                C692136i A002 = AnonymousClass2UX.A00(r6);
                if (!(A002 == null || A002.A01 == null)) {
                    if (C18020vd.A05(C18040vf.A02, this.A0B, 7268)) {
                        boolean A022 = A02(r6);
                        AnonymousClass210 r63 = (AnonymousClass210) r6;
                        if (!A022) {
                            return new C78863to(context, r5, r63);
                        }
                        C18070vi.A0j(context, r63);
                        ? r13 = new C78883tq(context, r5, r63);
                        r13.A1M();
                        r13.A2t();
                        return r13;
                    }
                }
                return new C78853tn(context, r5, (AnonymousClass210) r6);
            }
        }
        AnonymousClass3uP r14 = new AnonymousClass3uP(context, r5, r6);
        r14.A1M();
        return r14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A02(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            X.36i r0 = X.AnonymousClass2UX.A00(r6)
            if (r0 == 0) goto L_0x0063
            X.9Ic r3 = r0.A01
            if (r3 == 0) goto L_0x0063
            org.json.JSONArray r0 = A0h
            if (r0 != 0) goto L_0x0044
            java.lang.String r4 = "providers"
            X.00H r0 = r5.A0G
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            X.0ve r1 = r0.A00
            X.0vf r2 = X.C18040vf.A01
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x003b
            X.0ve r1 = r5.A0B     // Catch:{ Exception -> 0x0035 }
            r0 = 11621(0x2d65, float:1.6284E-41)
            org.json.JSONObject r1 = X.C18020vd.A02(r2, r1, r0)     // Catch:{ Exception -> 0x0035 }
            boolean r0 = r1.has(r4)     // Catch:{ Exception -> 0x0035 }
            if (r0 == 0) goto L_0x003b
            org.json.JSONArray r0 = r1.getJSONArray(r4)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0040
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "ConversationRowInflater: Failed to retrieve list of link source providers"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x003b:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L_0x0040:
            A0h = r0
            if (r0 == 0) goto L_0x0063
        L_0x0044:
            r2 = 0
        L_0x0045:
            org.json.JSONArray r0 = A0h     // Catch:{ Exception -> 0x005d }
            int r0 = r0.length()     // Catch:{ Exception -> 0x005d }
            if (r2 >= r0) goto L_0x0063
            int r1 = r3.value     // Catch:{ Exception -> 0x005d }
            org.json.JSONArray r0 = A0h     // Catch:{ Exception -> 0x005d }
            int r0 = r0.getInt(r2)     // Catch:{ Exception -> 0x005d }
            if (r1 != r0) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x005b:
            r0 = 1
            return r0
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "ConversationRowInflater: unknown link source provider"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88524a2.A02(X.206):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01fe, code lost:
        if (X.C62872s8.A00(r15) == 1) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0204, code lost:
        if (r15.A0v.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0206, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x020c, code lost:
        if (r15.A0v.A02 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x020e, code lost:
        return 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02f1, code lost:
        if (r15.A0v.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x02f3, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x030a, code lost:
        if (r15.A0v.A02 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x030c, code lost:
        return 36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        return 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        return 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        return 6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AnonymousClass206 r15) {
        /*
            r14 = this;
            X.AW0 r13 = X.AnonymousClass25B.A00(r15)
            int r12 = r15.A0u
            r5 = 76
            r6 = 65
            r8 = 66
            r11 = 28
            r4 = 1
            r10 = 14
            r7 = 64
            r9 = 6
            r1 = 5
            r3 = 35
            r2 = 8
            switch(r12) {
                case 0: goto L_0x002f;
                case 1: goto L_0x027e;
                case 2: goto L_0x0252;
                case 3: goto L_0x0232;
                case 4: goto L_0x0200;
                case 5: goto L_0x01dd;
                case 6: goto L_0x001c;
                case 7: goto L_0x002f;
                case 8: goto L_0x001c;
                case 9: goto L_0x01f4;
                case 10: goto L_0x01da;
                case 11: goto L_0x01d5;
                case 12: goto L_0x0060;
                case 13: goto L_0x01ca;
                case 14: goto L_0x0208;
                case 15: goto L_0x0227;
                case 16: goto L_0x01bf;
                case 17: goto L_0x001c;
                case 18: goto L_0x001c;
                case 19: goto L_0x01bc;
                case 20: goto L_0x01af;
                case 21: goto L_0x01ac;
                case 22: goto L_0x01a9;
                case 23: goto L_0x019e;
                case 24: goto L_0x0193;
                case 25: goto L_0x0188;
                case 26: goto L_0x017d;
                case 27: goto L_0x0172;
                case 28: goto L_0x0167;
                case 29: goto L_0x015c;
                case 30: goto L_0x0151;
                case 31: goto L_0x0300;
                case 32: goto L_0x0146;
                case 33: goto L_0x001c;
                case 34: goto L_0x001c;
                case 35: goto L_0x001c;
                case 36: goto L_0x002e;
                case 37: goto L_0x013d;
                case 38: goto L_0x001c;
                case 39: goto L_0x001c;
                case 40: goto L_0x001c;
                case 41: goto L_0x001c;
                case 42: goto L_0x0132;
                case 43: goto L_0x0132;
                case 44: goto L_0x0127;
                case 45: goto L_0x011c;
                case 46: goto L_0x02eb;
                case 47: goto L_0x001c;
                case 48: goto L_0x001c;
                case 49: goto L_0x02eb;
                case 50: goto L_0x001c;
                case 51: goto L_0x0111;
                case 52: goto L_0x011c;
                case 53: goto L_0x001c;
                case 54: goto L_0x011c;
                case 55: goto L_0x011c;
                case 56: goto L_0x001c;
                case 57: goto L_0x0106;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x00fb;
                case 63: goto L_0x00f0;
                case 64: goto L_0x0227;
                case 65: goto L_0x001c;
                case 66: goto L_0x00e5;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                case 69: goto L_0x001c;
                case 70: goto L_0x001c;
                case 71: goto L_0x001c;
                case 72: goto L_0x00da;
                case 73: goto L_0x00d7;
                case 74: goto L_0x001c;
                case 75: goto L_0x001c;
                case 76: goto L_0x001c;
                case 77: goto L_0x001c;
                case 78: goto L_0x0132;
                case 79: goto L_0x001c;
                case 80: goto L_0x00cc;
                case 81: goto L_0x00c1;
                case 82: goto L_0x0132;
                case 83: goto L_0x00cc;
                case 84: goto L_0x001c;
                case 85: goto L_0x00b6;
                case 86: goto L_0x001c;
                case 87: goto L_0x001c;
                case 88: goto L_0x001c;
                case 89: goto L_0x001c;
                case 90: goto L_0x00ab;
                case 91: goto L_0x001c;
                case 92: goto L_0x00a0;
                case 93: goto L_0x001c;
                case 94: goto L_0x0095;
                case 95: goto L_0x0092;
                case 96: goto L_0x008f;
                case 97: goto L_0x001c;
                case 98: goto L_0x008c;
                case 99: goto L_0x0081;
                case 100: goto L_0x001c;
                case 101: goto L_0x001c;
                case 102: goto L_0x001c;
                case 103: goto L_0x0076;
                case 104: goto L_0x001c;
                case 105: goto L_0x006b;
                case 106: goto L_0x02f5;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r0 = r15.A0D()
            r1 = -1
            if (r0 != r1) goto L_0x02ff
            if (r12 != r1) goto L_0x02ff
            X.205 r0 = r15.A0v
            boolean r2 = r0.A02
        L_0x0029:
            r7 = 15
            if (r2 == 0) goto L_0x002e
        L_0x002d:
            r7 = 6
        L_0x002e:
            return r7
        L_0x002f:
            boolean r0 = r15 instanceof X.C436420i
            if (r0 == 0) goto L_0x0294
            r0 = r15
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            X.205 r0 = r15.A0v
            boolean r2 = r0.A02
            if (r2 == 0) goto L_0x0049
            if (r1 != r9) goto L_0x0049
            X.2MP r15 = (X.AnonymousClass2MP) r15
            com.whatsapp.data.ProfilePhotoChange r0 = r15.A00
            if (r0 == 0) goto L_0x002d
            r1 = 19
            return r1
        L_0x0049:
            r0 = 41
            r3 = 40
            if (r1 == r0) goto L_0x030e
            if (r1 == r3) goto L_0x030e
            r0 = 42
            if (r1 == r0) goto L_0x030e
            if (r1 == r7) goto L_0x030e
            if (r1 == r6) goto L_0x030e
            if (r1 == r8) goto L_0x030e
            if (r1 != r5) goto L_0x0029
            r1 = 92
            return r1
        L_0x0060:
            if (r13 == 0) goto L_0x0068
            int r0 = r13.A03
            if (r0 == r1) goto L_0x0068
            goto L_0x0306
        L_0x0068:
            r1 = 22
            return r1
        L_0x006b:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 117(0x75, float:1.64E-43)
            return r1
        L_0x0076:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 119(0x77, float:1.67E-43)
            return r1
        L_0x0081:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 115(0x73, float:1.61E-43)
            return r1
        L_0x008c:
            r1 = 114(0x72, float:1.6E-43)
            return r1
        L_0x008f:
            r1 = 113(0x71, float:1.58E-43)
            return r1
        L_0x0092:
            r1 = 112(0x70, float:1.57E-43)
            return r1
        L_0x0095:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 110(0x6e, float:1.54E-43)
            return r1
        L_0x00a0:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 108(0x6c, float:1.51E-43)
            return r1
        L_0x00ab:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 106(0x6a, float:1.49E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 105(0x69, float:1.47E-43)
            return r1
        L_0x00b6:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 102(0x66, float:1.43E-43)
            return r1
        L_0x00c1:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 100
            if (r0 == 0) goto L_0x02ff
            r1 = 99
            return r1
        L_0x00cc:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 98
            return r1
        L_0x00d7:
            r1 = 97
            return r1
        L_0x00da:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 96
            if (r0 == 0) goto L_0x02ff
            r1 = 95
            return r1
        L_0x00e5:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 94
            if (r0 == 0) goto L_0x02ff
            r1 = 93
            return r1
        L_0x00f0:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 91
            if (r0 == 0) goto L_0x02ff
            r1 = 90
            return r1
        L_0x00fb:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 89
            if (r0 == 0) goto L_0x02ff
            r1 = 88
            return r1
        L_0x0106:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 87
            if (r0 == 0) goto L_0x02ff
            r1 = 86
            return r1
        L_0x0111:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 84
            if (r0 == 0) goto L_0x02ff
            r1 = 83
            return r1
        L_0x011c:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 70
            if (r0 == 0) goto L_0x02ff
            r1 = 69
            return r1
        L_0x0127:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 68
            if (r0 == 0) goto L_0x02ff
            r1 = 67
            return r1
        L_0x0132:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 72
            if (r0 == 0) goto L_0x02ff
            r1 = 71
            return r1
        L_0x013d:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0145
            r6 = 66
        L_0x0145:
            return r6
        L_0x0146:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 63
            if (r0 == 0) goto L_0x02ff
            r1 = 62
            return r1
        L_0x0151:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 61
            if (r0 == 0) goto L_0x02ff
            r1 = 60
            return r1
        L_0x015c:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 59
            if (r0 == 0) goto L_0x02ff
            r1 = 58
            return r1
        L_0x0167:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 57
            if (r0 == 0) goto L_0x02ff
            r1 = 56
            return r1
        L_0x0172:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 55
            if (r0 == 0) goto L_0x02ff
            r1 = 54
            return r1
        L_0x017d:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 53
            if (r0 == 0) goto L_0x02ff
            r1 = 52
            return r1
        L_0x0188:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 51
            if (r0 == 0) goto L_0x02ff
            r1 = 50
            return r1
        L_0x0193:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 48
            if (r0 == 0) goto L_0x02ff
            r1 = 47
            return r1
        L_0x019e:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 46
            if (r0 == 0) goto L_0x02ff
            r1 = 45
            return r1
        L_0x01a9:
            r1 = 44
            return r1
        L_0x01ac:
            r1 = 43
            return r1
        L_0x01af:
            if (r13 != 0) goto L_0x0306
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 39
            if (r0 == 0) goto L_0x02ff
            r1 = 38
            return r1
        L_0x01bc:
            r1 = 37
            return r1
        L_0x01bf:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 31
            if (r0 == 0) goto L_0x02ff
            r1 = 30
            return r1
        L_0x01ca:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 25
            if (r0 == 0) goto L_0x02ff
            r1 = 24
            return r1
        L_0x01d5:
            if (r13 != 0) goto L_0x0306
            r1 = 20
            return r1
        L_0x01da:
            r1 = 21
            return r1
        L_0x01dd:
            boolean r1 = r15.A0z(r2)
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x01ee
            r1 = 82
            if (r0 == 0) goto L_0x02ff
            r1 = 81
            return r1
        L_0x01ee:
            r1 = 13
            if (r0 == 0) goto L_0x02ff
            r1 = 4
            return r1
        L_0x01f4:
            boolean r0 = X.A3I.A02(r15)
            if (r0 == 0) goto L_0x0211
            int r0 = X.C62872s8.A00(r15)
            if (r0 != r4) goto L_0x0208
        L_0x0200:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0207
            r10 = 5
        L_0x0207:
            return r10
        L_0x0208:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0210
            r11 = 29
        L_0x0210:
            return r11
        L_0x0211:
            boolean r1 = r15.A0z(r2)
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0222
            r1 = 80
            if (r0 == 0) goto L_0x02ff
            r1 = 79
            return r1
        L_0x0222:
            if (r0 != 0) goto L_0x0231
            r2 = 17
            return r2
        L_0x0227:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r2 = 27
            if (r0 == 0) goto L_0x0231
            r2 = 26
        L_0x0231:
            return r2
        L_0x0232:
            boolean r1 = r15.A0z(r2)
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0241
            if (r0 == 0) goto L_0x0240
            r5 = 75
        L_0x0240:
            return r5
        L_0x0241:
            if (r0 == 0) goto L_0x0245
            r1 = 3
            return r1
        L_0x0245:
            X.0ve r0 = r14.A0B
            boolean r0 = X.AnonymousClass72Z.A01(r0, r15)
            r1 = 23
            if (r0 == 0) goto L_0x02ff
            r1 = 12
            return r1
        L_0x0252:
            r3 = r15
            X.22l r3 = (X.C441822l) r3
            X.0ve r2 = r14.A0B
            r1 = 1040(0x410, float:1.457E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0271
            boolean r1 = r3.A1L()
        L_0x0265:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0278
            r1 = 16
            if (r0 == 0) goto L_0x02ff
            r1 = 7
            return r1
        L_0x0271:
            int r0 = r3.A09
            r1 = 1
            if (r0 == r4) goto L_0x0265
            r1 = 0
            goto L_0x0265
        L_0x0278:
            r1 = 11
            if (r0 == 0) goto L_0x02ff
            r1 = 2
            return r1
        L_0x027e:
            boolean r1 = r15.A0z(r2)
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x028f
            r1 = 78
            if (r0 == 0) goto L_0x02ff
            r1 = 77
            return r1
        L_0x028f:
            if (r0 != 0) goto L_0x0293
            r4 = 10
        L_0x0293:
            return r4
        L_0x0294:
            if (r13 != 0) goto L_0x0306
            boolean r0 = r15.A0z(r2)
            if (r0 == 0) goto L_0x02a7
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 74
            if (r0 == 0) goto L_0x02ff
            r1 = 73
            return r1
        L_0x02a7:
            X.0zA r1 = r14.A0I
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x02bb
            r1.A03()
            boolean r0 = X.C87494Vu.A00(r15)
            if (r0 == 0) goto L_0x02bb
            r1 = 104(0x68, float:1.46E-43)
            return r1
        L_0x02bb:
            boolean r0 = X.AnonymousClass25A.A0t(r15)
            if (r0 == 0) goto L_0x02eb
            X.00H r0 = r14.A0g
            java.lang.Object r1 = r0.get()
            X.1i4 r1 = (X.C32981i4) r1
            r0 = r15
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A07
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x02eb
            X.0ve r2 = r14.A0B
            r1 = 10630(0x2986, float:1.4896E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02eb
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 124(0x7c, float:1.74E-43)
            return r1
        L_0x02eb:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 9
            if (r0 == 0) goto L_0x02ff
            r1 = 0
            return r1
        L_0x02f5:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 == 0) goto L_0x02ff
            r1 = 121(0x79, float:1.7E-43)
        L_0x02ff:
            return r1
        L_0x0300:
            if (r13 == 0) goto L_0x030f
            int r0 = r13.A03
            if (r0 == r1) goto L_0x030f
        L_0x0306:
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x030e
            r3 = 36
        L_0x030e:
            return r3
        L_0x030f:
            r1 = 49
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88524a2.A03(X.206):int");
    }

    public C88524a2(Context context, AnonymousClass1GP r6, C19880zA r7, C19880zA r8, C19880zA r9, AnonymousClass1KB r10, AnonymousClass11S r11, AnonymousClass4P6 r12, C27201Vd r13, AnonymousClass4Xe r14, AnonymousClass5XI r15, C63232sj r16, AnonymousClass4OU r17, C134196qC r18, C31131f4 r19, C51922a3 r20, AnonymousClass11P r21, C18000vb r22, C26031Qo r23, C190559l9 r24, C48122Lg r25, C25181Nf r26, AnonymousClass12B r27, AnonymousClass4QD r28, C18030ve r29, AnonymousClass4VE r30, C88304Zd r31, C25461Oh r32, AnonymousClass1R2 r33, C85764Oq r34, AnonymousClass70H r35, C26631Sw r36, C50522Ut r37, AnonymousClass129 r38, AnonymousClass1DC r39, AnonymousClass10I r40, AnonymousClass88M r41, AnonymousClass00H r42, AnonymousClass00H r43, ThreadPoolExecutor threadPoolExecutor) {
        this.A0R = r21;
        C18030ve r1 = r29;
        this.A0B = r1;
        this.A01 = context;
        this.A0f = r40;
        this.A0C = r30;
        this.A0N = r16;
        this.A0L = r13;
        this.A0b = r35;
        this.A0M = r15;
        this.A03 = r6;
        this.A0I = r7;
        this.A0d = r38;
        this.A0A = r23;
        this.A0D = r34;
        this.A04 = r8;
        this.A0Y = r31;
        this.A0E = r36;
        this.A0c = r37;
        this.A07 = r14;
        this.A0P = r18;
        this.A0V = r26;
        this.A0Q = r19;
        this.A0T = r24;
        this.A0F = r41.BGh(threadPoolExecutor);
        this.A05 = r11;
        this.A0U = r25;
        this.A0S = r22;
        this.A0O = r17;
        this.A06 = r12;
        this.A0a = r33;
        this.A0e = r39;
        this.A09 = r20;
        this.A0Z = r32;
        this.A0X = r28;
        this.A0J = r9;
        this.A0W = r27;
        this.A0K = r10;
        this.A0G = r42;
        this.A0g = r43;
        boolean A012 = AnonymousClass1J8.A01(r1);
        this.A0H = A012;
        if (A012) {
            TypedValue typedValue = new TypedValue();
            AnonymousClass1L9.A00(context).getTheme().resolveAttribute(2130970642, typedValue, true);
            this.A02 = new C003101k(context, typedValue.resourceId);
            return;
        }
        this.A02 = context;
    }
}
