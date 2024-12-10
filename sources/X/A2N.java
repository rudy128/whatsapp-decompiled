package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

public final class A2N {
    public String A00 = null;
    public final long A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Map A0A;
    public final boolean A0B;
    public final boolean A0C;

    public A2N(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, long j, boolean z, boolean z2) {
        C18070vi.A0d(str3, 5);
        this.A02 = userJid;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A01 = j;
        this.A09 = str5;
        this.A0C = z;
        this.A0B = z2;
        this.A03 = str6;
        this.A04 = str7;
        this.A0A = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2N) {
                A2N a2n = (A2N) obj;
                if (!C18070vi.A18(this.A02, a2n.A02) || !C18070vi.A18(this.A06, a2n.A06) || !C18070vi.A18(this.A05, a2n.A05) || !C18070vi.A18(this.A07, a2n.A07) || !C18070vi.A18(this.A08, a2n.A08) || this.A01 != a2n.A01 || !C18070vi.A18(this.A09, a2n.A09) || !C18070vi.A18(this.A00, a2n.A00) || this.A0C != a2n.A0C || this.A0B != a2n.A0B || !C18070vi.A18(this.A03, a2n.A03) || !C18070vi.A18(this.A04, a2n.A04) || !C18070vi.A18(this.A0A, a2n.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(A2N a2n, Jid jid, Object obj, Object obj2, Object[] objArr) {
        objArr[5] = new AnonymousClass1D6("flow_token", a2n.A07);
        objArr[6] = new AnonymousClass1D6("flow_message_version", obj);
        objArr[7] = new AnonymousClass1D6("extension_id", obj2);
        objArr[8] = new AnonymousClass1D6("business_jid", jid.getRawString());
        objArr[9] = new AnonymousClass1D6("version", a2n.A00);
        objArr[10] = new AnonymousClass1D6("is_draft", Boolean.valueOf(a2n.A0B));
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A06, AnonymousClass000.A0L(this.A02));
        int A023 = C17890vO.A02(this.A08, C17890vO.A02(this.A07, (C17890vO.A02(this.A05, A022) + 1169897944) * 31));
        return ((C17890vO.A02(this.A03, AnonymousClass0DV.A00(AnonymousClass0DV.A00((C17890vO.A02(this.A09, (AnonymousClass001.A0K(this.A01, A023) - 1809421292) * 31) + C17900vP.A00(this.A00)) * 31, this.A0C), this.A0B)) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A0A);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsContextParams(bizJid=");
        A10.append(this.A02);
        A10.append(", flowMessageVersion=");
        A10.append(this.A06);
        A10.append(", flowId=");
        A10.append(this.A05);
        A10.append(", actionName=");
        A10.append("galaxy_message");
        A10.append(", flowToken=");
        A10.append(this.A07);
        A10.append(", messageId=");
        A10.append(this.A08);
        A10.append(", messageRowId=");
        A10.append(this.A01);
        A10.append(", referral=");
        A10.append(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        A10.append(", sessionId=");
        A10.append(this.A09);
        A10.append(", dataApiVersion=");
        A10.append(this.A00);
        A10.append(", isResumableFlow=");
        A10.append(this.A0C);
        A10.append(", isDraft=");
        A10.append(this.A0B);
        A10.append(", externalObserverId=");
        A10.append(this.A03);
        A10.append(", flowAction=");
        A10.append(this.A04);
        A10.append(", flowActionPayload=");
        return AnonymousClass001.A1F(this.A0A, A10);
    }
}
