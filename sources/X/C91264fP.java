package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4fP  reason: invalid class name and case insensitive filesystem */
public class C91264fP implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;

    public C91264fP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        Integer num;
        AnonymousClass206 A06;
        boolean A002;
        switch (this.A00) {
            case 0:
                ((AnonymousClass3Uc) this.A01).A00 = AnonymousClass000.A0M(obj);
                return;
            case 1:
                ((AnonymousClass1DS) this.A01).A0E(obj);
                return;
            case 2:
                ((AnonymousClass3VM) this.A01).A0T((AnonymousClass4PG) obj);
                return;
            case 3:
                AnonymousClass4P8 r8 = (AnonymousClass4P8) obj;
                int size = ((ContactPickerFragment) ((AnonymousClass48m) this.A01).A01).A4G.size();
                r8.A00 = 2;
                r8.A07 = Integer.valueOf(size);
                return;
            case 4:
                C75433hU r0 = (C75433hU) this.A01;
                AnonymousClass1E7 r82 = (AnonymousClass1E7) obj;
                if (r82 != null) {
                    r0.A0C.A0R(r0.A0Z.A0I(r82));
                    return;
                }
                return;
            case 5:
                ((C77803rV) this.A01).A0K((AnonymousClass1E7) obj);
                return;
            case 6:
                C85854Oz r83 = (C85854Oz) obj;
                C99244sV A003 = C99244sV.A00(new C91264fP(this.A01, 9), 47);
                r83.A04 = C17880vN.A0i();
                r83.A05 = new C99134sK(r83, A003, 12);
                return;
            case 7:
                C85854Oz r84 = (C85854Oz) obj;
                int intValue = AnonymousClass6WK.A00(((AnonymousClass4aY) this.A01).A3R).intValue();
                r84.A04 = C17880vN.A0h();
                r84.A01 = Integer.valueOf(intValue);
                return;
            case 8:
                AnonymousClass4aY r4 = (AnonymousClass4aY) this.A01;
                List<C25195Cam> list = (List) obj;
                AnonymousClass1FY A0Q = AnonymousClass3MW.A0Q(r4);
                if (A0Q != null) {
                    for (C25195Cam cam : list) {
                        if (cam.A01.A00.contains(A0Q)) {
                            boolean A004 = CD7.A00(cam);
                            r4.A6h = A004;
                            r4.A3E(A004);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                AnonymousClass4aY r42 = (AnonymousClass4aY) this.A01;
                AnonymousClass4O8 r85 = (AnonymousClass4O8) obj;
                int intExtra = r42.A0B.getIntExtra("mat_entry_point", 0);
                AnonymousClass1BI r3 = r42.A3R;
                Integer valueOf = Integer.valueOf(intExtra);
                if (valueOf != null) {
                    int i = 1;
                    switch (valueOf.intValue()) {
                        case 0:
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 28;
                            break;
                        case 11:
                            i = 12;
                            break;
                        case 12:
                            i = 14;
                            break;
                        case 13:
                            i = 17;
                            break;
                        case 14:
                            i = 18;
                            break;
                        case 15:
                            i = 19;
                            break;
                        case 16:
                            i = 20;
                            break;
                        case 17:
                            i = 21;
                            break;
                        case 18:
                            i = 22;
                            break;
                        case 19:
                            i = 23;
                            break;
                        case 20:
                            i = 24;
                            break;
                        case 22:
                            i = 15;
                            break;
                        case 23:
                            i = 25;
                            break;
                        case 24:
                            i = 26;
                            break;
                        case 25:
                            i = 16;
                            break;
                        case 26:
                            i = 27;
                            break;
                        case 27:
                            i = 49;
                            break;
                        case 28:
                            i = 11;
                            break;
                        case 29:
                            i = 13;
                            break;
                        case 30:
                            i = 29;
                            break;
                        case 31:
                            i = 30;
                            break;
                        case 32:
                            i = 31;
                            break;
                        default:
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Conversation entry point to chat entry point conversion error. Got an unsupported\n                | conversation entry point '");
                            A10.append(valueOf);
                            Log.w(AnonymousClass1YE.A07(AnonymousClass1Y7.A02(AnonymousClass000.A0y("'.", A10)), "\n", "", false));
                            break;
                    }
                    num = Integer.valueOf(i);
                } else {
                    num = null;
                }
                r85.A02 = num;
                r85.A01 = AnonymousClass6WK.A00(r3);
                boolean A1R = AnonymousClass000.A1R(r42.A2w.A03(r3));
                r85.A00 = Boolean.valueOf(A1R);
                if (A1R && (A06 = r42.A31.A06(r3, false)) != null) {
                    r85.A03 = r42.A2z.BUn(Long.valueOf(A06.A0x));
                    return;
                }
                return;
            case 10:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A01;
                List<C25195Cam> list2 = (List) obj;
                if (list2.isEmpty()) {
                    A002 = false;
                } else {
                    for (C25195Cam cam2 : list2) {
                        if (cam2.A01.A00.contains(mediaGalleryActivity)) {
                            A002 = CD7.A00(cam2);
                        }
                    }
                    return;
                }
                mediaGalleryActivity.A0l = A002;
                View findViewById = mediaGalleryActivity.findViewById(2131435555);
                if (findViewById != null) {
                    findViewById.setVisibility(C72453Mb.A07(mediaGalleryActivity.A0l ? 1 : 0));
                    return;
                }
                return;
            case 11:
                AnonymousClass41J r43 = (AnonymousClass41J) this.A01;
                List<C25195Cam> list3 = (List) obj;
                C18070vi.A0d(list3, 1);
                for (C25195Cam cam3 : list3) {
                    Activity activity = r43.A00;
                    if (activity != null && cam3.A01.A00.contains(activity)) {
                        r43.A06(CD7.A00(cam3));
                        return;
                    }
                }
                return;
            case 12:
                C74793cj r2 = (C74793cj) this.A01;
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    r2.setVisibility(8);
                    return;
                }
                r2.setDescription((CharSequence) str);
                r2.setVisibility(0);
                return;
            case 15:
                WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = (WallpaperCurrentPreviewActivity) this.A01;
                AnonymousClass1ZO.A03(wallpaperCurrentPreviewActivity);
                WallpaperCurrentPreviewActivity.A0V(wallpaperCurrentPreviewActivity);
                return;
            default:
                AnonymousClass1ZO.A03((Context) this.A01);
                return;
        }
    }
}
