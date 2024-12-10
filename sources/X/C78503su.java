package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.whatsapp.conversation.carousel.CarouselView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3su  reason: invalid class name and case insensitive filesystem */
public abstract class C78503su extends C78883tq {
    public CarouselView A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public ArrayList A03 = AnonymousClass000.A13();
    public boolean A04;
    public boolean A05;
    public final C78033s1 A06;
    public final C108675c7 A07;
    public final Runnable A08 = new C98784ri((Object) this, 20);

    public C78503su(Context context, C108875cR r8, AnonymousClass210 r9) {
        super(context, r8, r9);
        C18030ve r4 = this.A0F;
        C18070vi.A0W(r4);
        this.A06 = new C78033s1(AnonymousClass3MY.A04(this), r8, (C63232sj) C18070vi.A0E(getBotPluginUtil()), r4, this.A03);
        this.A07 = getCarouselCustomizer();
    }

    public boolean A1j() {
        return true;
    }

    public void A2V(AnonymousClass206 r6, boolean z) {
        C18070vi.A0d(r6, 0);
        boolean z2 = !r6.equals(this.A0I);
        super.A2V(r6, z);
        if (z2 || z) {
            AnonymousClass3VB r0 = this.A0C;
            if (r0 != null) {
                ArrayList arrayList = this.A03;
                C18070vi.A0d(arrayList, 0);
                C137196v4.A01(r0.A03, arrayList);
            }
            AnonymousClass210 r02 = (AnonymousClass210) this.A0I;
            C18070vi.A0X(r02);
            A2v(r02);
        }
        C108875cR r2 = this.A0k;
        if (r2 != null && r2.Bcq()) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                if (r2.Bfa(C17880vN.A0Y(it))) {
                    this.A05 = true;
                    return;
                }
            }
        } else if (this.A05) {
            A2i();
            this.A05 = false;
        }
    }

    public boolean A2h(AnonymousClass205 r5) {
        C18070vi.A0d(r5, 0);
        if (!C18070vi.A18(this.A0I.A0v, r5)) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18(AnonymousClass3MZ.A10(it), r5)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A2v(AnonymousClass210 r7) {
        if (((C63232sj) getBotPluginUtil().get()).A02(r7)) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 7075)) {
                this.A18.A09(new C98814rl(this, r7, 23), new AnonymousClass25F[]{C18070vi.A09(r7, C692836p.class)});
                return;
            }
        }
        A2i();
        C78033s1 r3 = this.A06;
        if (r3.A00 == AnonymousClass00R.A00 && r3.A01.size() != 0) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 12073)) {
                C47192Hl r1 = new C47192Hl();
                r1.A02 = 89;
                AnonymousClass3MZ.A1T(r1, 1);
                r1.A09 = C17880vN.A0n(AnonymousClass3MX.A02(r3.A01, 1));
                ((AnonymousClass18K) getWamRuntime().get()).CC7(r1);
            }
        }
    }

    public final void A2w(AnonymousClass210 r8, ArrayList arrayList, boolean z) {
        C18070vi.A0d(r8, 0);
        boolean z2 = false;
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A0I, r8);
        if (!z) {
            if (this.A03.size() == arrayList.size()) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (this.A03.get(i) != arrayList.get(i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        if (A1Z || z) {
            this.A03 = arrayList;
            this.A06.A0U(arrayList);
            if (A1Z) {
                getCarouselRecyclerView().A0f(0);
            }
            if (z || A1Z) {
                z2 = true;
            }
        }
        A2V(r8, z2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C79103uS.A1G(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            int i = (int) rawX;
            int i2 = (int) rawY;
            Rect A072 = AnonymousClass3MW.A07();
            getCarouselRecyclerView().getGlobalVisibleRect(A072);
            if (A072.contains(i, i2)) {
                this.A0g = true;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.A0g = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0) {
            int i = (int) rawX;
            int i2 = (int) rawY;
            Rect A072 = AnonymousClass3MW.A07();
            getCarouselRecyclerView().getGlobalVisibleRect(A072);
            if (A072.contains(i, i2)) {
                this.A0g = true;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.A0g = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBotPluginUtil(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCarouselRecyclerView(CarouselView carouselView) {
        C18070vi.A0d(carouselView, 0);
        this.A00 = carouselView;
    }

    public final void setWamRuntime(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final C108675c7 getCarouselCustomizer() {
        C108875cR r0;
        if (C42701yb.A01(this.A0I.A0v.A00) || (r0 = this.A0k) == null || r0.getContainerType() != 0) {
            return super.getRowCustomizer();
        }
        return this.A0B.A04;
    }

    private final C179479Ic getPluginProvider() {
        AnonymousClass206 r0 = this.A0I;
        C18070vi.A0X(r0);
        C692136i A002 = AnonymousClass2UX.A00(r0);
        if (A002 != null) {
            return A002.A01;
        }
        return null;
    }

    public void A1v() {
        this.A06.notifyDataSetChanged();
    }

    public final void A2t() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass210) it.next()).A01 == 4) {
                if (!this.A04) {
                    this.A04 = true;
                    this.A0S.A0K(this.A08, C20113A7w.A0L);
                    return;
                }
                return;
            }
        }
    }

    public final void A2u() {
        if (!C18020vd.A05(C18040vf.A02, this.A0F, 7268) || getPluginProvider() == null) {
            CarouselView carouselRecyclerView = getCarouselRecyclerView();
            C108675c7 r5 = this.A07;
            carouselRecyclerView.setPaddingRelative(r5.BNi() + r5.BW4(getContext(), ((Rect) C72463Mc.A0m(((C93084iP) this.A09).A0Q)).left), carouselRecyclerView.getPaddingTop(), r5.BNk(this.A0I) + r5.BW1(getContext(), ((Rect) C72463Mc.A0m(((C93084iP) this.A09).A0Q)).left), carouselRecyclerView.getPaddingBottom());
            return;
        }
        int A012 = AnonymousClass3MW.A01(getResources(), 2131168774);
        CarouselView carouselRecyclerView2 = getCarouselRecyclerView();
        carouselRecyclerView2.setPaddingRelative(A012, carouselRecyclerView2.getPaddingTop(), A012, carouselRecyclerView2.getPaddingBottom());
    }

    public final List getAlbumMessages() {
        return this.A03;
    }

    public List getAllMessages() {
        return C29431cG.A0k(this.A03, C18070vi.A0M(this.A0I));
    }

    public final AnonymousClass00H getBotPluginUtil() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("botPluginUtil");
        throw null;
    }

    public final C78033s1 getCarouselAdapter() {
        return this.A06;
    }

    public final CarouselView getCarouselRecyclerView() {
        CarouselView carouselView = this.A00;
        if (carouselView != null) {
            return carouselView;
        }
        C18070vi.A11("carouselRecyclerView");
        throw null;
    }

    public int getMessageCount() {
        return this.A03.size() + 1;
    }

    public final AnonymousClass00H getWamRuntime() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0S.A0I(this.A08);
        this.A04 = false;
    }
}
