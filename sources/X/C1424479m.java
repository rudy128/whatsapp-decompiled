package X;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.whatsapp.music.ui.MusicAttributionFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.79m  reason: invalid class name and case insensitive filesystem */
public class C1424479m implements C15930rR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1424479m(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        Integer num;
        long j;
        int i;
        if (this.A00 != 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A01;
            AnonymousClass206 r2 = (AnonymousClass206) this.A02;
            C18070vi.A0e(r2, 1, menuItem);
            int itemId = menuItem.getItemId();
            if (itemId == 2131432588) {
                AnonymousClass02B r0 = myStatusesActivity.A00;
                if (r0 != null) {
                    r0.A05();
                }
                myStatusesActivity.A0P = r2;
                if (myStatusesActivity.A0M != null) {
                    AnonymousClass1BI r7 = r2.A0v.A00;
                    int i2 = r2.A0u;
                    ArrayList A10 = C17880vN.A10(C18070vi.A0P(Integer.valueOf(i2)));
                    if (i2 == 3) {
                        j = C17890vO.A03(((AnonymousClass21V) r2).A0D);
                    } else {
                        j = 0;
                    }
                    Long valueOf = Long.valueOf(j);
                    if (i2 == 0) {
                        String A0P = r2.A0P();
                        C17960vV.A07(A0P);
                        i = A0P.length();
                    } else {
                        i = 0;
                    }
                    Integer valueOf2 = Integer.valueOf(i);
                    Intent A0B = C72473Md.A0B(myStatusesActivity, "com.whatsapp.contact.picker.ContactPicker");
                    A0B.putExtra("source_surface", 83);
                    C72483Me.A0h(A0B, r7, A10, true);
                    if (valueOf != null) {
                        A0B.putExtra("forward_video_duration", valueOf);
                    }
                    if (valueOf2 != null) {
                        A0B.putExtra("forward_text_length", valueOf2);
                    }
                    C108995ce.A17(myStatusesActivity.A01, AnonymousClass1L9.A07(A0B, myStatusesActivity, 2) ? 1 : 0);
                    return true;
                }
                str = "waIntents";
            } else if (itemId == 2131432582) {
                Map map = myStatusesActivity.A12;
                map.clear();
                AnonymousClass205 r02 = r2.A0v;
                C18070vi.A0W(r02);
                map.put(r02, r2);
                AnonymousClass4Yv.A01(myStatusesActivity, 13);
                map.clear();
                return true;
            } else {
                if (itemId == 2131432627) {
                    num = AnonymousClass00R.A00;
                } else if (itemId == 2131432629) {
                    num = AnonymousClass00R.A0C;
                } else if (itemId == 2131432628) {
                    num = AnonymousClass00R.A01;
                } else if (itemId != 2131432527) {
                    return true;
                } else {
                    C19880zA r1 = myStatusesActivity.A04;
                    if (r1 == null) {
                        str = "smbLwiAnalytics";
                    } else if (r1.A07()) {
                        r1.A03();
                        myStatusesActivity.A4c();
                        throw AnonymousClass000.A0s("logStatusEntryPointClicked");
                    } else {
                        C19880zA r03 = myStatusesActivity.A03;
                        if (r03 != null) {
                            C19880zA.A02(r03);
                            new C115185tX(AnonymousClass00R.A0o, C108955ca.A0w(r2), (String) null, 4);
                            throw AnonymousClass000.A0s("launchAdsCreationExperience");
                        }
                        str = "smbAdsCreationActivityRouterLazy";
                    }
                }
                Map map2 = myStatusesActivity.A12;
                map2.clear();
                AnonymousClass205 r04 = r2.A0v;
                C18070vi.A0W(r04);
                map2.put(r04, r2);
                myStatusesActivity.A4e(C17880vN.A0l(), 4, num, C18070vi.A0M(r2));
                return true;
            }
        } else {
            MusicAttributionFragment musicAttributionFragment = (MusicAttributionFragment) this.A01;
            AnonymousClass77U r4 = (AnonymousClass77U) this.A02;
            musicAttributionFragment.A28();
            AnonymousClass00H r05 = musicAttributionFragment.A04;
            if (r05 != null) {
                ((C36361nl) r05.get()).CGU(musicAttributionFragment.A14(), Uri.parse(r4.A00), (AnonymousClass206) null);
                return true;
            }
            str = "linkLauncher";
        }
        C18070vi.A11(str);
        throw null;
    }
}
