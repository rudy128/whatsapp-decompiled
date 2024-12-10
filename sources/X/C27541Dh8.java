package X;

import com.facebook.wearable.datax.LocalChannel;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dh8  reason: case insensitive filesystem */
public final class C27541Dh8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27541Dh8(BXN bxn) {
        super(0);
        this.this$0 = bxn;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String A00;
        BXN bxn = this.this$0;
        C25258Cbx cbx = bxn.A01.A00;
        LocalChannel localChannel = cbx.A01;
        if (localChannel != null) {
            cbx.A03(new CompletableFuture());
            BQm bQm = bxn.A01;
            CompletableFuture A01 = bQm.A00.A01();
            if (A01 != null) {
                C25845Cn1 cn1 = C24712CGy.A01;
                cn1.A02("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER] snAppManagerChannel.send, stop SNAM");
                AtomicBoolean atomicBoolean = bxn.A02;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        C23624Bmt A0N = C23631Bn0.DEFAULT_INSTANCE.A0N();
                        ((C23631Bn0) C17880vN.A0G(A0N)).appID_ = C17.A00(bQm.A0G.A01).BVW();
                        byte[] A0M = A0N.A0C().A0M();
                        localChannel.send(new C25527ChP(2002, Arrays.copyOf(A0M, A0M.length)));
                    } catch (C24202BxE e) {
                        if (e.error.A00 == 49156) {
                            cn1.A05("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER] Internal Error, LocalChannel could not find receiver", e);
                        } else {
                            throw e;
                        }
                    }
                    try {
                        obj = (String) A01.get(2000, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        obj = C108945cZ.A1J(th);
                    }
                    if (!(obj instanceof AnonymousClass1IU)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("[SN_APP_MANAGER] SNAM shutdown with response ");
                        A10.append((String) obj);
                        cn1.A02("sup:SNAppManagerStateDelegate", AnonymousClass000.A0y(".  Closing channel", A10));
                    }
                    Throwable A002 = C30671eK.A00(obj);
                    if (A002 != null) {
                        bxn.A0A(new C27815Dlr(bxn, A002));
                    }
                    C26153CtL ctL = BQm.A0Q;
                    CXV A03 = ctL.A03();
                    if (!(A03 == null || (A00 = A03.A00()) == null)) {
                        C26153CtL.A01(ctL, 9, A00, 12, false);
                    }
                    atomicBoolean.set(false);
                }
            }
        }
        C27541Dh8.super.A08();
        return C27621Wu.A00;
    }
}
