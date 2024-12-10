package X;

import android.content.Intent;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;

/* renamed from: X.7KS  reason: invalid class name */
public class AnonymousClass7KS implements C23691Hg {
    public final int A00;
    public final String A01;
    public final String A02;

    public AnonymousClass7KS(String str, String str2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void CGE(Object obj) {
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity;
        Runnable runnable;
        AnonymousClass4WT r15;
        int i;
        long j;
        long j2;
        int i2;
        switch (this.A00) {
            case 0:
                String str = this.A01;
                String str2 = this.A02;
                C1604688p r152 = (C1604688p) obj;
                C18070vi.A0d(r152, 2);
                r152.C5C(str, str2);
                return;
            case 1:
                String str3 = this.A01;
                String str4 = this.A02;
                r15 = (AnonymousClass4WT) obj;
                linkedDevicesEnterCodeActivity = r15.A00;
                ((C195219sz) linkedDevicesEnterCodeActivity.A0C.get()).A01(9, str3, str4);
                i = 32;
                break;
            case 2:
                String str5 = this.A01;
                String str6 = this.A02;
                r15 = (AnonymousClass4WT) obj;
                linkedDevicesEnterCodeActivity = r15.A00;
                ((C195219sz) linkedDevicesEnterCodeActivity.A0C.get()).A01(9, str5, str6);
                i = 30;
                break;
            case 3:
                String str7 = this.A01;
                String str8 = this.A02;
                AnonymousClass4WT r153 = (AnonymousClass4WT) obj;
                linkedDevicesEnterCodeActivity = r153.A00;
                runnable = new AnonymousClass7Pq(r153, str7, str8, 6);
                break;
            case 4:
                String str9 = this.A01;
                String str10 = this.A02;
                AnonymousClass4WT r154 = (AnonymousClass4WT) obj;
                LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity2 = r154.A00;
                C19830z4 r3 = linkedDevicesEnterCodeActivity2.A0A;
                int i3 = C17890vO.A0B(r3).getInt("companion_reg_with_link_code_retry_count", 0) + 1;
                C17900vP.A0M(r3, "companion_reg_with_link_code_retry_count", i3);
                if (i3 >= 3) {
                    Log.w("LinkedDevicesEnterCodeActivity/companionRegWithLinkCodeObserver/onLinkCodeIsWrong retry limit is exceeded");
                    C17880vN.A1B(C19830z4.A00(linkedDevicesEnterCodeActivity2.A0A), "companion_reg_with_link_code_retry_count");
                    linkedDevicesEnterCodeActivity2.A05.CGF(new C21452AkJ(49, str9, r154));
                    LinkedDevicesEnterCodeActivity.A0d(linkedDevicesEnterCodeActivity2, str9);
                }
                C195219sz r6 = (C195219sz) linkedDevicesEnterCodeActivity2.A0C.get();
                long A012 = AnonymousClass11P.A01(r6.A03);
                C35861mv r5 = r6.A02;
                synchronized (r5) {
                    j = r5.A00;
                    r5.A00 = 0;
                }
                if (j + 180000 > A012) {
                    i2 = 15;
                } else {
                    synchronized (r5) {
                        j2 = r5.A01;
                        r5.A01 = 0;
                    }
                    int i4 = ((j2 + 180000) > A012 ? 1 : ((j2 + 180000) == A012 ? 0 : -1));
                    i2 = 8;
                    if (i4 > 0) {
                        i2 = 16;
                    }
                }
                r6.A01(i2, str9, str10);
                linkedDevicesEnterCodeActivity2.runOnUiThread(new C98764rg((Object) r154, 29));
                return;
            default:
                String str11 = this.A01;
                String str12 = this.A02;
                C134226qF r155 = (C134226qF) obj;
                C18070vi.A0d(r155, 2);
                if (r155 instanceof AnonymousClass6H6) {
                    AnonymousClass6H6 r156 = (AnonymousClass6H6) r155;
                    if (1 - r156.A00 == 0) {
                        C18070vi.A0h(str11, str12);
                        StickerPackFlow stickerPackFlow = (StickerPackFlow) r156.A02;
                        AnonymousClass3MW.A1X(stickerPackFlow.A0B, new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(stickerPackFlow, str11, str12, (C30391dr) null, (C108475bl) r156.A01), stickerPackFlow.A0C);
                        return;
                    }
                    return;
                }
                AnonymousClass6H5 r157 = (AnonymousClass6H5) r155;
                switch (r157.A00) {
                    case 3:
                    case 4:
                    case 5:
                        ((AnonymousClass722) r157.A01).A03();
                        return;
                    case 6:
                        StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r157.A01;
                        if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                            StickerStoreMyTabFragment.A00((StickerStoreMyTabFragment) stickerStoreTabFragment);
                            return;
                        }
                        return;
                    case 8:
                        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) r157.A01;
                        if (str11.equals(addStickerPackDialogFragment.A02) && str12.equals(addStickerPackDialogFragment.A03)) {
                            Object[] A1b = AnonymousClass3MW.A1b();
                            A1b[0] = addStickerPackDialogFragment.A04;
                            addStickerPackDialogFragment.A00.A0L(AnonymousClass3MX.A16(addStickerPackDialogFragment, addStickerPackDialogFragment.A1H(2131899103), A1b, 1, 2131896516), 1);
                            AnonymousClass1FL A1B = addStickerPackDialogFragment.A1B();
                            if (A1B != null) {
                                Intent A0A = C17880vN.A0A();
                                A0A.putExtra("add_successful", true);
                                A1B.setResult(-1, A0A);
                                addStickerPackDialogFragment.A29();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
        runnable = new C98764rg((Object) r15, i);
        linkedDevicesEnterCodeActivity.runOnUiThread(runnable);
    }
}
