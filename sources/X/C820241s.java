package X;

import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.bots.GetImagineMeOnboardedResponseImpl;
import com.whatsapp.infra.graphql.generated.bots.ImagineMeFieldsImpl;
import java.util.Random;
import org.json.JSONArray;

/* renamed from: X.41s  reason: invalid class name and case insensitive filesystem */
public final class C820241s extends BaseMexCallback {
    public final AnonymousClass5WY A00;
    public final BaseMexCallback A01;
    public final AnonymousClass1NV A02 = new AnonymousClass1NV(new Random(), 5, 60000, 1000);
    public final /* synthetic */ ImagineMeOnboardingRequester A03;

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers xwa2FetchWaUsers;
        ImagineMeFieldsImpl A0H;
        C18070vi.A0d(a8k, 0);
        AnonymousClass1IX A0A = a8k.A0A(GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers.class, "xwa2_fetch_wa_users");
        if (A0A == null || (xwa2FetchWaUsers = (GetImagineMeOnboardedResponseImpl.Xwa2FetchWaUsers) C29431cG.A0c(A0A)) == null || (A0H = xwa2FetchWaUsers.A0H()) == null || !A0H.A0G("memu_onboarded")) {
            A00((A6Z) null);
        } else {
            this.A01.A02(a8k);
        }
    }

    public boolean A05(A6Z a6z) {
        C18070vi.A0d(a6z, 0);
        A00(a6z);
        return false;
    }

    public C820241s(AnonymousClass5WY r9, ImagineMeOnboardingRequester imagineMeOnboardingRequester, BaseMexCallback baseMexCallback) {
        this.A03 = imagineMeOnboardingRequester;
        this.A00 = r9;
        this.A01 = baseMexCallback;
    }

    private final void A00(A6Z a6z) {
        Long A012 = this.A02.A01();
        if (A012 == null) {
            BaseMexCallback baseMexCallback = this.A01;
            if (a6z == null) {
                a6z = new A6Z(new Throwable("Reached max retry attempts"), (JSONArray) null);
            }
            baseMexCallback.A05(a6z);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetImagineMeOnboardedCallbackWrapper/retry requesting again in ");
        A10.append(A012);
        C17890vO.A1A(A10, " ms");
        ImagineMeOnboardingRequester imagineMeOnboardingRequester = this.A03;
        imagineMeOnboardingRequester.A02.CGv(new C146507Pj(imagineMeOnboardingRequester, this, 17), A012.longValue());
    }
}
