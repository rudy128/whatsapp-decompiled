package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6MH  reason: invalid class name */
public class AnonymousClass6MH extends A34 {
    public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
    public final AnonymousClass18K A01;
    public final C129306ha A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public void A0F() {
        AnonymousClass1FL r5 = (AnonymousClass1FL) this.A06.get();
        if (r5 != null) {
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A05;
            Bundle A0D = C17880vN.A0D();
            A0D.putString("sticker_pack_id", str);
            A0D.putString("sticker_pack_authority", str2);
            A0D.putString("sticker_pack_name", str3);
            AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = new AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment();
            addStickerPackDialogFragment.A1R(A0D);
            this.A00 = addStickerPackDialogFragment;
            addStickerPackDialogFragment.A2C(r5.getSupportFragmentManager(), "add");
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A05)) {
                AnonymousClass638 r7 = new AnonymousClass638();
                try {
                    C134006pr r1 = this.A02.A03;
                    AnonymousClass725 A002 = r1.A00(str2, str, C18070vi.A15(str2, str));
                    boolean A17 = C18070vi.A17(str2, str);
                    if (((AnonymousClass702) r1.A05.get()).A04(str2, str)) {
                        return new C127946fC(0, (String) null);
                    }
                    r7.A00 = Boolean.valueOf(A002.A0Q);
                    r7.A02 = C108975cc.A0Y(A002.A07);
                    r7.A03 = Long.valueOf((A002.A01 / 10) / 1024);
                    r7.A01 = Boolean.valueOf(A17);
                    AnonymousClass18K r3 = this.A01;
                    r3.CC7(r7);
                    C1185163t r2 = new C1185163t();
                    r2.A02 = false;
                    r2.A05 = C17880vN.A0j();
                    r2.A01 = Boolean.valueOf(A002.A0S);
                    r2.A00 = false;
                    r3.CC7(r2);
                    return new C127946fC(A17 ? 1 : 0, (String) null);
                } catch (Exception e) {
                    Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e);
                    r7.A01 = false;
                    this.A01.CC7(r7);
                    return new C127946fC(2, e.getMessage());
                }
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("one of the follow fields are empty. pack id:");
        A10.append(str);
        A10.append(",authority:");
        A10.append(this.A03);
        A10.append(",sticker pack name:");
        return new C127946fC(2, AnonymousClass000.A0y(this.A05, A10));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C127946fC r7 = (C127946fC) obj;
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0Z) {
            int i = r7.A00;
            if (i == 0) {
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = addStickerPackDialogFragment.A05;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A00(addStickerPackDialogFragment, AnonymousClass3MX.A16(addStickerPackDialogFragment, addStickerPackDialogFragment.A1H(2131899103), A1b, 1, 2131896517), 8, 0, 8);
                Activity activity = (Activity) this.A06.get();
                if (activity != null) {
                    Intent A0A = C17880vN.A0A();
                    A0A.putExtra("already_added", true);
                    activity.setResult(-1, A0A);
                }
            } else if (i == 1) {
                Object[] A1b2 = AnonymousClass3MW.A1b();
                A1b2[0] = addStickerPackDialogFragment.A05;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A00(addStickerPackDialogFragment, AnonymousClass3MX.A16(addStickerPackDialogFragment, addStickerPackDialogFragment.A1H(2131899103), A1b2, 1, 2131886513), 8, 8, 0);
            } else {
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A00(addStickerPackDialogFragment, AnonymousClass3MX.A16(addStickerPackDialogFragment, addStickerPackDialogFragment.A1H(2131899103), new Object[1], 0, 2131896518), 8, 0, 8);
                Activity activity2 = (Activity) this.A06.get();
                if (activity2 != null) {
                    Intent A0A2 = C17880vN.A0A();
                    A0A2.putExtra("validation_error", r7.A01);
                    activity2.setResult(0, A0A2);
                }
            }
        }
    }

    public AnonymousClass6MH(AnonymousClass1FL r2, AnonymousClass18K r3, C129306ha r4, String str, String str2, String str3) {
        this.A01 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = r4;
        this.A06 = AnonymousClass3MW.A0z(r2);
    }
}
