package X;

import com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository;

/* renamed from: X.Awf  reason: case insensitive filesystem */
public final class C22039Awf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C22382B5l $avatarAREffectsControllerFactory;
    public final /* synthetic */ C25761ClW $avatarRichMediaViewerModel;
    public final /* synthetic */ C136796uQ $avatarUserManagementHelper;
    public final /* synthetic */ C22360B4o $callbackProvider;
    public final /* synthetic */ C25073CWg $platformEventsController;
    public final /* synthetic */ CZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22039Awf(C25761ClW clW, C22360B4o b4o, C25073CWg cWg, C22382B5l b5l, CZL czl, C136796uQ r7) {
        super(0);
        this.$avatarAREffectsControllerFactory = b5l;
        this.this$0 = czl;
        this.$platformEventsController = cWg;
        this.$avatarUserManagementHelper = r7;
        this.$callbackProvider = b4o;
        this.$avatarRichMediaViewerModel = clW;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22382B5l b5l = this.$avatarAREffectsControllerFactory;
        CZL czl = this.this$0;
        C25073CWg cWg = this.$platformEventsController;
        C136796uQ r6 = this.$avatarUserManagementHelper;
        C22360B4o b4o = this.$callbackProvider;
        C25761ClW clW = this.$avatarRichMediaViewerModel;
        AnonymousClass10E r0 = ((C20897AbD) b5l).A00.A00;
        return new C188109gt(clW, b4o, cWg, (AvatarAREffectRepository) r0.A00.A0H.get(), czl, r6, AnonymousClass10E.AL1(r0));
    }
}
