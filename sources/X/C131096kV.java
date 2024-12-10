package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.6kV  reason: invalid class name and case insensitive filesystem */
public final class C131096kV {
    public Button A00;
    public C28931bI A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final StatusPlaybackProgressView A0E;
    public final C28931bI A0F;

    public C131096kV(View view, boolean z) {
        C18070vi.A0d(view, 1);
        this.A09 = (FrameLayout) C18070vi.A05(view, 2131434744);
        this.A07 = (ViewGroup) C18070vi.A05(view, 2131435625);
        this.A0E = (StatusPlaybackProgressView) C18070vi.A05(view, 2131433893);
        this.A0D = AnonymousClass3Ma.A0E(view, 2131429789);
        this.A0C = AnonymousClass3Ma.A0E(view, 2131429735);
        this.A0A = AnonymousClass3Ma.A0C(view, 2131428012);
        this.A0F = C28931bI.A00(view, 2131436942);
        this.A05 = C18070vi.A05(view, 2131436219);
        this.A04 = C18070vi.A05(view, 2131436235);
        this.A06 = C18070vi.A05(view, 2131431358);
        this.A03 = C18070vi.A05(view, 2131435645);
        this.A02 = C18070vi.A05(view, 2131432492);
        this.A0B = AnonymousClass3Ma.A0C(view, 2131434167);
        ViewStub viewStub = (ViewStub) C18070vi.A05(view, 2131427503);
        this.A08 = viewStub;
        viewStub.setVisibility(8);
        if (z) {
            this.A01 = C28931bI.A00(view, 2131437027);
        }
    }
}
