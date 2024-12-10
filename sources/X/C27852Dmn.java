package X;

import android.content.Context;
import android.os.HandlerThread;

/* renamed from: X.Dmn  reason: case insensitive filesystem */
public final class C27852Dmn extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25761ClW $avatarRichMediaViewerModel;
    public final /* synthetic */ CQQ $avatarSdkHttpClient;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C28478E2t $experimentUtilFactory;
    public final /* synthetic */ E49 $mediaGraphErrorCallback;
    public final /* synthetic */ C26705DAe $richMediaLogger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27852Dmn(Context context, E49 e49, C25761ClW clW, CQQ cqq, C28478E2t e2t, C26705DAe dAe) {
        super(0);
        this.$experimentUtilFactory = e2t;
        this.$avatarRichMediaViewerModel = clW;
        this.$context = context;
        this.$avatarSdkHttpClient = cqq;
        this.$richMediaLogger = dAe;
        this.$mediaGraphErrorCallback = e49;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.DAv] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.DEE, java.lang.Object, X.E4f] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.EAf] */
    public /* bridge */ /* synthetic */ Object invoke() {
        C26722DAw dAw = new C26722DAw(this.$avatarRichMediaViewerModel, new Object());
        Context context = this.$context;
        int A00 = AnonymousClass4ZO.A00(AnonymousClass4D9.LIVE_EDITING);
        CQQ cqq = this.$avatarSdkHttpClient;
        C26705DAe dAe = this.$richMediaLogger;
        E49 e49 = this.$mediaGraphErrorCallback;
        C18070vi.A0e(context, 0, cqq);
        C18070vi.A0d(dAe, 4);
        DDU ddu = new DDU(context, C26074Cro.A00((HandlerThread) null, e49, "RichMedia", "whatsapp_avatar"));
        ddu.A02(new C22889BUa(ddu));
        ? obj = new Object();
        obj.A00 = ddu;
        ddu.A02(obj);
        ddu.A02(new BUX(ddu));
        ? obj2 = new Object();
        ddu.A01(new BUH(ddu, obj2), ED3.A00);
        C26074Cro.A01(dAe, ddu, dAw, cqq, A00);
        ddu.A01(new C22808BPw(ddu), EDA.A00);
        ddu.A01(new BUG(ddu), ED1.A00);
        ddu.A01(new BUO(ddu, false), EDE.A00);
        BUM bum = new BUM(ddu);
        bum.A01.CL2();
        ddu.A01(new BQ1(ddu), EDD.A00);
        ddu.A01(bum, EDB.A00);
        ddu.A01(new C22806BPu(ddu), ED9.A04);
        return ddu;
    }
}
