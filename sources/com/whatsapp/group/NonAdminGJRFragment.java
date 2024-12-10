package com.whatsapp.group;

import X.AnonymousClass10E;
import X.AnonymousClass11T;
import X.AnonymousClass1EC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8FW;
import X.AnonymousClass9VU;
import X.C172648tl;
import X.C18070vi;
import X.C194389re;
import X.C20330AGm;
import X.C42941yz;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;

public final class NonAdminGJRFragment extends Hilt_NonAdminGJRFragment {
    public AnonymousClass9VU A00;
    public C172648tl A01;
    public AnonymousClass8FW A02;
    public AnonymousClass1EC A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625508, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        try {
            C42941yz r0 = AnonymousClass1EC.A01;
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                str = bundle2.getString("gid");
            } else {
                str = null;
            }
            AnonymousClass1EC A012 = C42941yz.A01(str);
            this.A03 = A012;
            AnonymousClass9VU r02 = this.A00;
            if (r02 != null) {
                AnonymousClass10E r03 = r02.A00.A02;
                this.A02 = new AnonymousClass8FW(AnonymousClass10E.A4z(r03), (C194389re) r03.A7Y.get(), A012, AnonymousClass10E.AL1(r03));
                C172648tl r1 = this.A01;
                if (r1 != null) {
                    AnonymousClass1EC r04 = this.A03;
                    if (r04 == null) {
                        C18070vi.A11("groupJid");
                        throw null;
                    }
                    r1.A00 = r04;
                    RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131433759);
                    AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
                    C172648tl r05 = this.A01;
                    if (r05 != null) {
                        recyclerView.setAdapter(r05);
                        AnonymousClass8FW r06 = this.A02;
                        if (r06 == null) {
                            AnonymousClass3MW.A1H();
                            throw null;
                        } else {
                            r06.A00.A0A(A1G(), new C20330AGm(this, recyclerView, 0));
                        }
                    } else {
                        C18070vi.A11("nonAdminGJRAdapter");
                        throw null;
                    }
                } else {
                    C18070vi.A11("nonAdminGJRAdapter");
                    throw null;
                }
            } else {
                C18070vi.A11("nonAdminGJRViewModelFactory");
                throw null;
            }
        } catch (AnonymousClass11T e) {
            Log.e("GroupPendingParticipants started with invalid jid ", e);
            C72463Mc.A1A(this);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A1Z(false);
    }
}
