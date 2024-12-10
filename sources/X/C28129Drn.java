package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.Drn  reason: case insensitive filesystem */
public final class C28129Drn extends AnonymousClass11G implements C22821Di {
    public static final C28129Drn A00 = new C28129Drn();

    public C28129Drn() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        C18070vi.A0d(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
