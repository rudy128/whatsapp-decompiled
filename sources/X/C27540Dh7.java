package X;

import com.facebook.wearable.datax.LocalChannel;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dh7  reason: case insensitive filesystem */
public final class C27540Dh7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27540Dh7(BXN bxn) {
        super(0);
        this.this$0 = bxn;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        LocalChannel localChannel;
        C26127Csp csp;
        C24810CLd cLd;
        C25845Cn1 cn1 = C24712CGy.A01;
        BXN bxn = this.this$0;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[SN_APP_MANAGER] Linked device ");
        C22871BTf bTf = bxn.A01.A00.A04;
        Object obj = null;
        if (bTf != null) {
            UUID uuid = bTf.A02;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        cn1.A02("sup:SNAppManagerStateDelegate", AnonymousClass000.A0y(str, A10));
        C27540Dh7.super.A07();
        BXN bxn2 = this.this$0;
        C25258Cbx cbx = bxn2.A01.A00;
        bxn2.A02.set(false);
        bxn2.A00 = new CompletableFuture();
        C22871BTf bTf2 = cbx.A04;
        if (bTf2 == null || (csp = bTf2.A00) == null || (cLd = csp.A09) == null) {
            localChannel = null;
        } else {
            localChannel = new LocalChannel(cLd.A00.A07, 28);
            localChannel.onReceived = new C27967Dp3(bxn2);
            localChannel.onClosed = new C27543DhA(bxn2);
            localChannel.onError = new C27968Dp4(bxn2);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("[SN_APP_MANAGER]: snAppManagerChannel.send, start LS request [");
            A102.append(bxn2.A03.get() + 1);
            cn1.A02("sup:SNAppManagerStateDelegate", C17890vO.A0c(A102, ']'));
            BQm bQm = bxn2.A01;
            C25838Cms cms = bQm.A0J;
            if (cms != null) {
                cms.A03("sn_app_manager_start_request");
            }
            try {
                C23624Bmt A0N = C23640Bn9.DEFAULT_INSTANCE.A0N();
                ((C23640Bn9) C17880vN.A0G(A0N)).appID_ = C17.A00(bQm.A0G.A01).BVW();
                byte[] A0M = A0N.A0C().A0M();
                localChannel.send(new C25527ChP(2000, Arrays.copyOf(A0M, A0M.length)));
            } catch (C24202BxE e) {
                if (e.error.A00 == 49156) {
                    cn1.A05("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER] Internal Error, LocalChannel could not find receiver", e);
                } else {
                    throw e;
                }
            }
        }
        try {
            CompletableFuture A00 = bxn2.A00;
            if (A00 != null) {
                obj = (Boolean) A00.get(3000, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            cbx.A01 = localChannel;
        }
        if (C30671eK.A00(obj) != null) {
            bxn2.A0A(new C27539Dh6(bxn2));
        }
        return C27621Wu.A00;
    }
}
