package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity;
import java.util.Locale;

/* renamed from: X.9Ad  reason: invalid class name and case insensitive filesystem */
public class C177679Ad extends C38471rL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C177679Ad(CustomNotificationsInfoView customNotificationsInfoView, AnonymousClass1EC r3) {
        this.A00 = 5;
        this.A03 = customNotificationsInfoView;
        this.A02 = r3;
        this.A01 = 16;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v49, types: [X.9NE, java.lang.Object] */
    public void A04(View view) {
        String str;
        String str2;
        AnonymousClass1FU r3;
        Context context;
        String str3;
        Editable text;
        switch (this.A00) {
            case 0:
                ThumbnailButton thumbnailButton = ((AnonymousClass8J4) this.A02).A01;
                if (thumbnailButton.getTag(2131432150) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView = (CatalogCarouselDetailImageView) this.A03;
                    C20287AEv aEv = catalogCarouselDetailImageView.A01;
                    String str4 = null;
                    if (aEv != null) {
                        str = aEv.A0H;
                    } else {
                        str = null;
                    }
                    UserJid userJid = catalogCarouselDetailImageView.A08;
                    if (str != null && userJid != null) {
                        A8Q catalogAnalyticManager = catalogCarouselDetailImageView.getCatalogAnalyticManager();
                        ? obj = new Object();
                        obj.A0B = catalogCarouselDetailImageView.getCatalogAnalyticManager().A03;
                        A8Q.A04(obj, catalogCarouselDetailImageView.getCatalogAnalyticManager());
                        A8Q.A03(obj, A8Q.A01(obj, catalogCarouselDetailImageView));
                        obj.A06 = C17880vN.A0m();
                        A7D.A02(obj, 25);
                        C20287AEv aEv2 = catalogCarouselDetailImageView.A01;
                        if (aEv2 != null) {
                            str4 = aEv2.A0H;
                        }
                        obj.A0H = str4;
                        obj.A00 = catalogCarouselDetailImageView.A08;
                        catalogAnalyticManager.A09(obj);
                        int i = this.A01;
                        thumbnailButton.setTag(A1M.A00(str, i));
                        catalogCarouselDetailImageView.getWaIntents().get();
                        Context context2 = catalogCarouselDetailImageView.getContext();
                        Intent A0A = C17880vN.A0A();
                        A0A.setClassName(context2.getPackageName(), "com.whatsapp.CatalogMediaView");
                        A0A.putExtra("target_image_index", i);
                        AnonymousClass3MY.A12(A0A, userJid, "cached_jid");
                        A0A.putExtra("product", catalogCarouselDetailImageView.A01);
                        AnonymousClass745.A09(catalogCarouselDetailImageView.getContext(), A0A, thumbnailButton, catalogCarouselDetailImageView.getAbProps());
                        AnonymousClass745.A08(catalogCarouselDetailImageView.getContext(), A0A, thumbnailButton, new AnonymousClass4ZR(AnonymousClass3MY.A04(catalogCarouselDetailImageView)), AnonymousClass001.A1H("thumb-transition-", A1M.A00(str, i), AnonymousClass000.A10()));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ThumbnailButton thumbnailButton2 = ((AnonymousClass8J4) this.A02).A01;
                if (thumbnailButton2.getTag(2131432150) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView2 = (CatalogCarouselDetailImageView) this.A03;
                    C20287AEv aEv3 = catalogCarouselDetailImageView2.A01;
                    String str5 = null;
                    if (aEv3 != null) {
                        str2 = aEv3.A0H;
                    } else {
                        str2 = null;
                    }
                    UserJid userJid2 = catalogCarouselDetailImageView2.A08;
                    if (str2 != null && userJid2 != null) {
                        A8Q catalogAnalyticManager2 = catalogCarouselDetailImageView2.getCatalogAnalyticManager();
                        ? obj2 = new Object();
                        obj2.A0B = catalogCarouselDetailImageView2.getCatalogAnalyticManager().A03;
                        A8Q.A04(obj2, catalogCarouselDetailImageView2.getCatalogAnalyticManager());
                        A8Q.A03(obj2, A8Q.A01(obj2, catalogCarouselDetailImageView2));
                        obj2.A06 = C17880vN.A0m();
                        A7D.A02(obj2, 25);
                        C20287AEv aEv4 = catalogCarouselDetailImageView2.A01;
                        if (aEv4 != null) {
                            str5 = aEv4.A0H;
                        }
                        obj2.A0H = str5;
                        obj2.A00 = catalogCarouselDetailImageView2.A08;
                        catalogAnalyticManager2.A09(obj2);
                        Activity A05 = AnonymousClass3Ma.A05(catalogCarouselDetailImageView2);
                        int i2 = this.A01;
                        AnonymousClass1Xr.A04(thumbnailButton2, AnonymousClass001.A1H("thumb-transition-", A1M.A00(str2, i2), AnonymousClass000.A10()));
                        catalogCarouselDetailImageView2.getWaIntents().get();
                        Context context3 = catalogCarouselDetailImageView2.getContext();
                        Intent A0A2 = C17880vN.A0A();
                        A0A2.setClassName(context3.getPackageName(), "com.whatsapp.CatalogImageListActivity");
                        A0A2.putExtra("image_index", i2);
                        AnonymousClass3MY.A12(A0A2, userJid2, "cached_jid");
                        A0A2.putExtra("product", catalogCarouselDetailImageView2.A01);
                        A05.startActivity(A0A2, AnonymousClass745.A05(A05, thumbnailButton2, AnonymousClass1Xr.A02(thumbnailButton2)));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C184249ae r4 = (C184249ae) this.A02;
                C186569eP r32 = r4.A01;
                r32.A01 = 2;
                int i3 = this.A01;
                ? obj3 = new Object();
                obj3.A00 = i3;
                obj3.A01 = (AEQ) this.A03;
                r32.A02 = obj3;
                r4.A00.A0E(r32);
                return;
            case 3:
                C37621pr r33 = (C37621pr) this.A03;
                ConversationsFragment conversationsFragment = r33.A06;
                AnonymousClass1E7 r42 = (AnonymousClass1E7) this.A02;
                AnonymousClass1BI r1 = r42.A0J;
                if (r1 != null) {
                    conversationsFragment.A2E((Intent) null, r1);
                    C37611pq r34 = r33.A08;
                    r34.A01(r42, Integer.valueOf(this.A01), 4, 87);
                    r34.A02(r42, (Integer) null, 87, true);
                    return;
                }
                return;
            case 4:
                ((Activity) this.A02).startActivityForResult((Intent) this.A03, this.A01);
                return;
            case 5:
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) this.A03;
                r3 = customNotificationsInfoView.A01;
                context = customNotificationsInfoView.getContext();
                break;
            case 6:
                NotificationsAndSoundsInfoView notificationsAndSoundsInfoView = (NotificationsAndSoundsInfoView) this.A03;
                r3 = notificationsAndSoundsInfoView.getActivity();
                notificationsAndSoundsInfoView.getWaIntents().get();
                context = notificationsAndSoundsInfoView.getContext();
                break;
            default:
                C161708Hk r43 = (C161708Hk) this.A03;
                r43.A00 = this.A01;
                AnonymousClass9YX r12 = r43.A03;
                C20263ADv aDv = (C20263ADv) this.A02;
                C18070vi.A0d(aDv, 0);
                IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity = r12.A00;
                TextInputLayout textInputLayout = indiaUpiSavingsOfferActivity.A01;
                if (textInputLayout == null) {
                    str3 = "savingsOfferCodeInput";
                } else {
                    EditText editText = textInputLayout.A0B;
                    if (!(editText == null || (text = editText.getText()) == null)) {
                        text.clear();
                    }
                    C18070vi.A0X(AnonymousClass1YF.A0I("").toUpperCase(Locale.ROOT));
                    indiaUpiSavingsOfferActivity.A04 = aDv;
                    Button button = indiaUpiSavingsOfferActivity.A00;
                    if (button == null) {
                        str3 = "applySavingsOfferButton";
                    } else {
                        button.setEnabled(true);
                        r43.notifyDataSetChanged();
                        return;
                    }
                }
                C18070vi.A11(str3);
                throw null;
        }
        C18070vi.A0X(context);
        r3.startActivityForResult(AnonymousClass1LU.A0t(context, (Jid) this.A02), 16, (Bundle) null);
    }

    public C177679Ad(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public C177679Ad(NotificationsAndSoundsInfoView notificationsAndSoundsInfoView, AnonymousClass1EC r3) {
        this.A00 = 6;
        this.A03 = notificationsAndSoundsInfoView;
        this.A02 = r3;
        this.A01 = 16;
    }
}
