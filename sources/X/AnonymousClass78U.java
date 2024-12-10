package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.videoplayback.HeroPlaybackControlView;
import java.util.Formatter;

/* renamed from: X.78U  reason: invalid class name */
public final class AnonymousClass78U implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, C28606E9x {
    public boolean A00;
    public final /* synthetic */ HeroPlaybackControlView A01;

    public void C0j() {
    }

    public void C0p(C24399C1u c1u, C0Q c0q) {
    }

    public void C93(C26539D3a d3a) {
    }

    public void CAS(C0Q c0q, String str) {
    }

    public AnonymousClass78U(HeroPlaybackControlView heroPlaybackControlView) {
        this.A01 = heroPlaybackControlView;
    }

    public void C0r(int i, boolean z) {
        this.A01.A00.post(new AnonymousClass7RJ(this, 12));
    }

    public void C0z(int i) {
        this.A01.A00.post(new AnonymousClass7RJ(this, 14));
    }

    public void C8e() {
        this.A01.A00.post(new AnonymousClass7RJ(this, 13));
    }

    public void onClick(View view) {
        C135046rZ r0;
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        AnonymousClass864 r02 = heroPlaybackControlView.A05;
        if (r02 != null) {
            C122076Mr r2 = ((AnonymousClass7O2) r02).A00;
            C121996Mj r1 = r2.A0C;
            if (r1 != null) {
                r1.A05 = null;
                r1.A06 = null;
            }
            C122076Mr.A00(r2);
            C135056ra r03 = r2.A09;
            if (r03 != null) {
                r03.A00();
            }
            AnonymousClass7RJ.A02(r2.A0Z, r2, 23);
        }
        if (heroPlaybackControlView.A0D == view && (r0 = heroPlaybackControlView.A04) != null) {
            int A08 = r0.A00.A08();
            C135046rZ r22 = heroPlaybackControlView.A04;
            if (A08 == 4) {
                r22.A01(0);
            } else {
                boolean z = !r22.A02();
                C26378Cye cye = r22.A00;
                if (z) {
                    cye.A0C();
                } else {
                    cye.A0B();
                }
            }
        }
        heroPlaybackControlView.A0A(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        long A04;
        if (z) {
            HeroPlaybackControlView heroPlaybackControlView = this.A01;
            TextView textView = heroPlaybackControlView.A0I;
            StringBuilder sb = heroPlaybackControlView.A0L;
            Formatter formatter = heroPlaybackControlView.A0M;
            long duration = heroPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                A04 = 0;
            } else {
                A04 = C17880vN.A04(duration * ((long) i));
            }
            textView.setText(CDS.A00(sb, formatter, A04));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.removeCallbacks(heroPlaybackControlView.A0J);
        AnonymousClass865 r1 = heroPlaybackControlView.A06;
        if (r1 != null) {
            AnonymousClass7O3 r12 = (AnonymousClass7O3) r1;
            if (r12.A00 != 0) {
                C122076Mr r2 = (C122076Mr) r12.A01;
                C121996Mj r13 = r2.A0C;
                if (r13 != null) {
                    r13.A05 = null;
                    r13.A06 = null;
                }
                C122076Mr.A00(r2);
                C135056ra r0 = r2.A09;
                if (r0 != null) {
                    r0.A00();
                }
                AnonymousClass7RJ.A02(r2.A0Z, r2, 23);
            } else {
                ((C122076Mr) r12.A01).A01++;
            }
        }
        C135046rZ r22 = heroPlaybackControlView.A04;
        if (r22 != null && r22.A02()) {
            r22.A00.A0B();
            this.A00 = true;
        }
        heroPlaybackControlView.A0B = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        long A04;
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.A0B = false;
        C135046rZ r8 = heroPlaybackControlView.A04;
        if (r8 != null) {
            int progress = seekBar.getProgress();
            long duration = heroPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                A04 = 0;
            } else {
                A04 = C17880vN.A04(duration * ((long) progress));
            }
            r8.A01(A04);
        }
        C135046rZ r1 = heroPlaybackControlView.A04;
        if (r1 != null && this.A00) {
            r1.A00.A0C();
        }
        this.A00 = false;
        heroPlaybackControlView.A0A(3000);
    }
}
