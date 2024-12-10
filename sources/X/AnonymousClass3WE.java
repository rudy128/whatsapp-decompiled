package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

/* renamed from: X.3WE  reason: invalid class name */
public final class AnonymousClass3WE extends C41251w3 {
    public final C22821Di A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626848, viewGroup, false);
        List list = C42011xT.A0I;
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.WDSListItem");
        return new AnonymousClass3Z2((WDSListItem) inflate, this.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    public AnonymousClass3WE(C22821Di r2) {
        super((C40411uf) new Object());
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        AnonymousClass786 r1;
        AnonymousClass3Z2 r52 = (AnonymousClass3Z2) r5;
        C108465bk r3 = (C108465bk) C72463Mc.A0l(this, r52, i);
        C18070vi.A0d(r3, 0);
        WDSListItem wDSListItem = r52.A00;
        wDSListItem.setText(r3.BaX());
        WDSIcon wDSIcon = wDSListItem.A0A;
        if (wDSIcon != null) {
            wDSIcon.setIcon(r3.BSg());
        }
        wDSListItem.setSubText(r3.BQY());
        boolean BeK = r3.BeK();
        WDSIcon wDSIcon2 = wDSListItem.A09;
        if (BeK) {
            if (wDSIcon2 != null) {
                wDSIcon2.setVariant(AnonymousClass4D8.BORDERLESS);
            }
            WDSIcon wDSIcon3 = wDSListItem.A09;
            if (wDSIcon3 != null) {
                wDSIcon3.setAction(AnonymousClass4D7.NORMAL);
            }
            WDSIcon wDSIcon4 = wDSListItem.A09;
            if (wDSIcon4 != null) {
                wDSIcon4.setIcon(2131233240);
            }
            r1 = null;
        } else {
            if (wDSIcon2 != null) {
                wDSIcon2.setVariant(AnonymousClass4D8.BORDERLESS);
            }
            WDSIcon wDSIcon5 = wDSListItem.A09;
            if (wDSIcon5 != null) {
                wDSIcon5.setAction(AnonymousClass4D7.NEUTRAL);
            }
            WDSIcon wDSIcon6 = wDSListItem.A09;
            if (wDSIcon6 != null) {
                wDSIcon6.setIcon(2131231681);
            }
            r1 = new AnonymousClass786(r52, r3, 24);
        }
        wDSListItem.setOnClickListener(r1);
    }
}
