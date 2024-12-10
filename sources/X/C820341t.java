package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.groups.QueryInviteLinkResponseImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.41t  reason: invalid class name and case insensitive filesystem */
public final class C820341t extends BaseMexCallback implements AnonymousClass1O5 {
    public final AnonymousClass1PY A00;
    public final boolean A01;
    public final AnonymousClass1KB A02;
    public final C18030ve A03;
    public final AnonymousClass1OZ A04;
    public final WeakReference A05;

    private final void A00(String str, int i) {
        Object obj = this.A05.get();
        if (obj != null) {
            this.A02.A0J(new C70783Cm(obj, this, str, i, 12));
        }
    }

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        String str;
        C18070vi.A0d(a8k, 0);
        C20125A8k A09 = a8k.A09(QueryInviteLinkResponseImpl.Xwa2GroupQueryById.class, "xwa2_group_query_by_id");
        if (A09 != null) {
            str = A09.A0F("invite_code");
        } else {
            str = null;
        }
        A00(str, 0);
    }

    public boolean A05(A6Z a6z) {
        C18070vi.A0d(a6z, 0);
        A00((String) null, a6z.A02().BOq());
        return false;
    }

    public final void A06(AnonymousClass1EC r15) {
        String str;
        C18070vi.A0d(r15, 0);
        boolean z = this.A01;
        if (!z) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 7908)) {
                GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                graphQlCallInput.A05("group_id", r15.getRawString());
                graphQlCallInput.A05("query_context", "INVITE_CODE");
                A7K a7k = new A7K();
                a7k.A04(graphQlCallInput, "group_input");
                this.A00.A01(new AIj(a7k, QueryInviteLinkResponseImpl.class, "QueryInviteLink")).A03(this);
                return;
            }
        }
        AnonymousClass1OZ r7 = this.A04;
        String A0B = r7.A0B();
        int i = 106;
        if (z) {
            i = 105;
        }
        if (z) {
            str = "set";
        } else {
            str = "get";
        }
        C29621ca r3 = new C29621ca("invite", (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r2, 0);
        C17880vN.A1Q("xmlns", "w:g2", r2, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, r2);
        r7.A0I(this, C29621ca.A00(r15, r3, r2), A0B, i, 32000);
    }

    public void BrD(String str) {
        A00((String) null, 0);
    }

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0d(r3, 1);
        A00((String) null, C60482o6.A00(r3));
    }

    public void C7Z(C29621ca r5, String str) {
        String str2;
        C18070vi.A0d(r5, 1);
        C29621ca A0J = r5.A0J(0);
        C29621ca.A04(A0J, "invite");
        if (A0J != null) {
            str2 = A0J.A0Q("code", (String) null);
        } else {
            str2 = null;
        }
        A00(str2, 0);
    }

    public C820341t(AnonymousClass1KB r2, C18030ve r3, C107515Zz r4, AnonymousClass1PY r5, AnonymousClass1OZ r6, boolean z) {
        C18070vi.A0s(r3, r2, r6, r5);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r6;
        this.A00 = r5;
        this.A01 = z;
        this.A05 = AnonymousClass3MW.A0z(r4);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
