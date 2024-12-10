package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass1YQ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass727;
import X.AnonymousClass77K;
import X.C003401n;
import X.C108945cZ;
import X.C126426ci;
import X.C138896xs;
import X.C142977Bn;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C72453Mb;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AudienceSelectionContactPickerFragment extends Hilt_AudienceSelectionContactPickerFragment {
    public int A00 = 1;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public List A03;
    public MenuItem A04;
    public AnonymousClass1YQ A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List list;
        List list2;
        String str;
        String str2;
        WaTextView waTextView;
        C18070vi.A0d(layoutInflater, 0);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = A27();
        }
        this.A00 = A27().getInt("status_distribution_mode");
        AnonymousClass77K A002 = AnonymousClass727.A00(bundle2, this.A2m);
        this.A1M = A002;
        if (A002 == null) {
            list = null;
        } else if (this.A00 == 1) {
            list = A002.A01;
        } else {
            list = A002.A02;
        }
        this.A38 = list;
        boolean z = A27().getBoolean("use_custom_multiselect_limit", false);
        this.A3f = z;
        if (z) {
            this.A00 = A27().getInt("custom_multiselect_limit");
            this.A01 = 2131755410;
        }
        boolean A1R = C17890vO.A1R(this.A00);
        AnonymousClass77K r0 = this.A1M;
        if (A1R) {
            list2 = r0.A01;
        } else {
            list2 = r0.A02;
        }
        this.A03 = list2;
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        if (A1q != null) {
            AnonymousClass1YQ r3 = (AnonymousClass1YQ) AnonymousClass1HF.A06(A1q, 2131434788);
            this.A05 = r3;
            if (r3 != null) {
                List list3 = this.A38;
                int i = 0;
                if ((list3 == null || !AnonymousClass000.A1a(list3)) && this.A00 == 1) {
                    i = 8;
                }
                r3.setVisibility(i);
            }
            AnonymousClass1YQ r1 = this.A05;
            if (r1 != null) {
                AnonymousClass3Ma.A1B(r1, this, 26);
            }
            if (this.A00 == 2) {
                this.A04 = true;
                RelativeLayout relativeLayout = this.A00;
                if (relativeLayout == null || (waTextView = AnonymousClass3MW.A0U(relativeLayout, 2131430382)) == null) {
                    waTextView = null;
                } else {
                    waTextView.setText(2131888803);
                }
                this.A02 = waTextView;
            }
        }
        AnonymousClass00H r02 = this.A01;
        if (r02 != null) {
            Long l = ((C138896xs) r02.get()).A00;
            if (l != null) {
                long longValue = l.longValue();
                AnonymousClass00H r03 = this.A02;
                if (r03 != null) {
                    C126426ci r6 = (C126426ci) r03.get();
                    if (this.A00 == 1) {
                        str2 = "selected_share_sheet_button";
                    } else {
                        str2 = "contacts_share_sheet_button";
                    }
                    r6.A00.A01(453118039, str2, longValue);
                    AnonymousClass00H r04 = this.A02;
                    if (r04 != null) {
                        ((C126426ci) r04.get()).A00.A04("see_full_screen_status_audience_selector");
                    }
                }
                str = "statusQplLoggerLazy";
            }
            return A1q;
        }
        str = "sharingSessionManager";
        C18070vi.A11(str);
        throw null;
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putInt("status_distribution_mode", this.A00);
        C108945cZ.A0u(this.A2m).A04(bundle, this.A1M);
    }

    public boolean A2p() {
        return true;
    }

    private final void A00() {
        long size = (long) this.A4G.size();
        int i = 2131755022;
        if (this.A00 == 1) {
            i = 2131755023;
        }
        C003401n A002 = C142977Bn.A00(this);
        if (A002 != null) {
            C18000vb r2 = this.A19;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, (int) size);
            A002.A0R(r2.A0K(A1a, i, size));
        }
    }

    public void A2F() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            ((C126426ci) r0.get()).A00.A00();
            super.A2F();
            return;
        }
        C18070vi.A11("statusQplLoggerLazy");
        throw null;
    }

    public boolean A2o() {
        List list = this.A03;
        if (list != null) {
            Map map = this.A4G;
            if (list.containsAll(map.keySet())) {
                Set keySet = map.keySet();
                List list2 = this.A03;
                if (list2 != null) {
                    if (keySet.containsAll(list2)) {
                        AnonymousClass00H r0 = this.A02;
                        if (r0 != null) {
                            ((C126426ci) r0.get()).A00.A06("selection_changed", false);
                            return super.A2o();
                        }
                        C18070vi.A11("statusQplLoggerLazy");
                        throw null;
                    }
                }
            }
            AnonymousClass00H r02 = this.A02;
            if (r02 != null) {
                ((C126426ci) r02.get()).A00.A06("selection_changed", true);
                A34();
                return true;
            }
            C18070vi.A11("statusQplLoggerLazy");
            throw null;
        }
        C18070vi.A11("originalSelectedContacts");
        throw null;
    }

    public boolean A2t() {
        return AnonymousClass000.A1T(this.A00, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.A00 != 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A35() {
        /*
            r4 = this;
            java.util.Map r0 = r4.A4G
            X.C18070vi.A0W(r0)
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r4.A00
            r1 = 0
            if (r0 == r3) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            X.1YQ r0 = r4.A05
            if (r0 == 0) goto L_0x0023
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            if (r2 != r1) goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            X.1YQ r0 = r4.A05
            if (r0 == 0) goto L_0x0022
            X.AnonymousClass71W.A00(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment.A35():void");
    }

    public void A1y(Bundle bundle) {
        super.A1y(bundle);
        C003401n A002 = C142977Bn.A00(this);
        boolean A1R = C17890vO.A1R(this.A00);
        Resources A09 = AnonymousClass3MZ.A09(this);
        int i = 2131886769;
        if (A1R) {
            i = 2131886770;
        }
        A002.A0S(A09.getString(i));
        A00();
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A15 = C18070vi.A15(menu, menuInflater);
        super.A22(menu, menuInflater);
        MenuItem icon = menu.add(A15 ? 1 : 0, 2131432621, A15, 2131897352).setIcon(2131232224);
        C18070vi.A0X(icon);
        this.A04 = icon;
        icon.setShowAsAction(2);
        MenuItem menuItem = this.A04;
        if (menuItem == null) {
            C18070vi.A11("unselectAllMenuItem");
            throw null;
        } else {
            menuItem.setTitle(2131897352);
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 2131432621) {
            return super.A24(menuItem);
        }
        Map map = this.A4G;
        C18070vi.A0W(map);
        if (!map.isEmpty()) {
            map.clear();
            A32().A00.clear();
            A2J();
            A32().notifyDataSetChanged();
            if (this.A00 == 2) {
                A35();
                A33();
            } else if (!this.A04) {
                SelectedListContactPickerFragment.A03(this, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168600), 0);
            } else {
                A35();
            }
            A00();
        }
        return true;
    }

    public void A2N() {
        A00();
    }
}
