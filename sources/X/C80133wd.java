package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import java.util.List;

/* renamed from: X.3wd  reason: invalid class name and case insensitive filesystem */
public abstract class C80133wd extends C75143e4 {
    public FrameLayout A00;
    public KeyboardPopupLayout A01;
    public AnonymousClass3uP A02;
    public AnonymousClass5ZI A03;
    public AnonymousClass4SX A04;
    public MessageSelectionDropDownRecyclerView A05;
    public Configuration A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new AnonymousClass5H2(this));
    public final C18100vl A08 = C83694Gh.A00(this, "EXTRA_CUSTOMIZER_ID", 0);
    public final C18100vl A09 = C83694Gh.A00(this, "EXTRA_INITIAL_TOP_MARGIN", 0);
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5H3(this));
    public final C18100vl A0B = C83694Gh.A00(this, "EXTRA_MSG_PADDING_BOTTOM", 0);
    public final C18100vl A0C = C83694Gh.A00(this, "EXTRA_MSG_PADDING_END", 0);
    public final C18100vl A0D = C83694Gh.A00(this, "EXTRA_MSG_PADDING_START", 0);
    public final C18100vl A0E = C83694Gh.A00(this, "EXTRA_MSG_PADDING_TOP", 0);
    public final C18100vl A0F = C83694Gh.A00(this, "EXTRA_PROFILE_PICTURE_WIDTH", 0);
    public final C18100vl A0G = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5NZ(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new AnonymousClass5H4(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(new AnonymousClass5H5(this));
    public final C18100vl A0J = C83694Gh.A00(this, "EXTRA_START_MARGIN", 0);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.3UB} */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A4f() {
        /*
            r15 = this;
            r8 = r15
            boolean r3 = r15 instanceof com.whatsapp.conversation.selection.SingleSelectedMessageActivity
            if (r3 == 0) goto L_0x0013
            r4 = r8
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r4 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r4
            X.3U8 r0 = r4.A04
            r10 = 0
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "singleSelectedMessageViewModel"
        L_0x000f:
            X.C18070vi.A11(r0)
            throw r10
        L_0x0013:
            r4 = r8
            com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity r4 = (com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity) r4
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r0 = r4.A00
            r10 = 0
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "selectedImageAlbumViewModel"
            goto L_0x000f
        L_0x001e:
            X.1DT r0 = r0.A00
            java.lang.Object r2 = r0.A06()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0098
            X.1It r1 = X.AnonymousClass3MW.A0N(r4)
            java.lang.Class<X.3UB> r0 = X.AnonymousClass3UB.class
            X.1J2 r10 = r1.A00(r0)
            X.3UB r10 = (X.AnonymousClass3UB) r10
            X.4lk r1 = new X.4lk
            r1.<init>()
            X.00H r0 = r4.A01
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.4Wb r0 = (X.C87564Wb) r0
            r10.A0T(r1, r0, r2)
            goto L_0x0098
        L_0x0047:
            X.1DT r0 = r0.A00
            X.206 r5 = X.AnonymousClass3MX.A0r(r0)
            if (r5 == 0) goto L_0x0098
            X.0zA r1 = r4.A00
            if (r1 == 0) goto L_0x0133
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r1 = r1.A03()
            X.1Ps r1 = (X.C25811Ps) r1
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x012c
            X.0zA r0 = r4.A00
            if (r0 == 0) goto L_0x0224
            java.lang.Object r0 = r0.A03()
            X.1Ps r0 = (X.C25811Ps) r0
            X.0vl r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            X.4lk r2 = (X.C95134lk) r2
        L_0x007b:
            X.1It r1 = X.AnonymousClass3MW.A0N(r4)
            java.lang.Class<X.3UB> r0 = X.AnonymousClass3UB.class
            X.1J2 r10 = r1.A00(r0)
            X.3UB r10 = (X.AnonymousClass3UB) r10
            java.util.List r1 = X.C18070vi.A0M(r5)
            X.00H r0 = r4.A08
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.4Wb r0 = (X.C87564Wb) r0
            r10.A0T(r2, r0, r1)
        L_0x0098:
            r2 = 0
            if (r10 != 0) goto L_0x00d0
            r0 = 0
            r15.setResult(r2, r0)
            r15.finish()
        L_0x00a2:
            X.5ZI r4 = r15.A03
            if (r4 == 0) goto L_0x021e
            X.1GP r1 = r15.getSupportFragmentManager()
            X.10I r0 = r15.A05
            X.2Py r0 = X.AnonymousClass68H.A01(r0)
            X.4a2 r7 = r4.BGL(r15, r1, r0)
            X.0vl r0 = r15.A07
            java.lang.Object r6 = r0.getValue()
            X.5cR r6 = (X.C108875cR) r6
            if (r3 == 0) goto L_0x0144
            r1 = r8
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r1 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r1
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.3U8 r0 = r1.A04
            r1 = 0
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "singleSelectedMessageViewModel"
            X.C18070vi.A11(r0)
            throw r1
        L_0x00d0:
            X.1wy r4 = r10.A03
            r0 = 39
            X.5Am r1 = X.AnonymousClass3MW.A16(r15, r0)
            r0 = 21
            X.C91644g1.A00(r15, r4, r1, r0)
            android.view.LayoutInflater r4 = r15.getLayoutInflater()
            r1 = 2131626044(0x7f0e083c, float:1.8879313E38)
            android.widget.FrameLayout r0 = r15.A4b()
            android.view.View r1 = r4.inflate(r1, r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r1 = (com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView) r1
            X.C18070vi.A0d(r1, r2)
            r15.A05 = r1
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r1 = r15.A4c()
            X.0vb r11 = r15.A00
            X.C18070vi.A0W(r11)
            if (r3 == 0) goto L_0x0123
            r0 = r8
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r0 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r0
            X.4lT r9 = new X.4lT
            r9.<init>((com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r0)
        L_0x010b:
            r1.A01 = r10
            android.content.Context r7 = X.AnonymousClass3MY.A04(r1)
            X.3X1 r6 = new X.3X1
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A00 = r6
            r1.setAdapter(r6)
            android.content.Context r0 = r1.getContext()
            X.AnonymousClass3Ma.A15(r0, r1)
            goto L_0x00a2
        L_0x0123:
            r0 = r8
            com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity r0 = (com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity) r0
            X.4lT r9 = new X.4lT
            r9.<init>((com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity) r0)
            goto L_0x010b
        L_0x012c:
            X.3vY r2 = new X.3vY
            r2.<init>()
            goto L_0x007b
        L_0x0133:
            java.lang.String r0 = "bonsaiUiUtilOptional"
            goto L_0x000f
        L_0x0137:
            X.1DT r0 = r0.A00
            X.206 r0 = X.AnonymousClass3MX.A0r(r0)
            if (r0 == 0) goto L_0x0210
            X.3uP r9 = r7.A05(r6, r0)
            goto L_0x0186
        L_0x0144:
            r5 = r8
            com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity r5 = (com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity) r5
            boolean r4 = X.C72453Mb.A1Z(r6)
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x0218
            X.1DT r0 = r0.A00
            java.util.List r1 = X.AnonymousClass3MW.A10(r0)
            if (r1 == 0) goto L_0x0210
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0210
            java.lang.Object r1 = r1.get(r2)
            X.21V r1 = (X.AnonymousClass21V) r1
            if (r1 == 0) goto L_0x0210
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            X.3uP r9 = r7.A06(r6, r1, r0)
            boolean r0 = r9 instanceof X.AnonymousClass3u4
            if (r0 == 0) goto L_0x0210
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x0218
            X.1DT r0 = r0.A00
            java.util.List r1 = X.AnonymousClass3MW.A10(r0)
            if (r1 != 0) goto L_0x0180
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x0180:
            r0 = r9
            X.3u9 r0 = (X.AnonymousClass3u9) r0
            r0.A2k(r1, r4)
        L_0x0186:
            X.0vl r0 = r15.A0G
            java.lang.Object r5 = r0.getValue()
            android.os.BaseBundle r5 = (android.os.BaseBundle) r5
            java.lang.String r1 = "EXTRA_SELECTION_SAVE_STATE_COLLAPSE_TYPE"
            r0 = -1
            int r0 = r5.getInt(r1, r0)
            r9.A23(r0)
            X.5cR r4 = r9.A0k
            if (r4 == 0) goto L_0x01aa
            X.206 r3 = r9.getFMessage()
            java.lang.String r1 = "EXTRA_SELECTION_SAVE_STATE_PAGE_LIMIT"
            r0 = 1
            int r0 = r5.getInt(r1, r0)
            r4.CJr(r3, r0)
        L_0x01aa:
            r9.A1u()
            X.0vb r10 = r15.A00
            X.0vl r0 = r15.A0D
            int r11 = X.C72453Mb.A0I(r0)
            X.0vl r0 = r15.A0E
            int r12 = X.C72453Mb.A0I(r0)
            X.0vl r0 = r15.A0C
            int r13 = X.C72453Mb.A0I(r0)
            X.0vl r0 = r15.A0B
            int r14 = X.C72453Mb.A0I(r0)
            X.C27641Ww.A07(r9, r10, r11, r12, r13, r14)
            X.C43531zx.A05(r9, r2)
            r9.A1x()
            r0 = 1
            r9.setEnabled(r0)
            r9.A2i = r2
            X.C89924dF.A00(r9, r15, r0)
            android.widget.FrameLayout r0 = r15.A4b()
            r0.addView(r9)
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            if (r1 == 0) goto L_0x0209
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            X.0vl r0 = r15.A0I
            int r0 = X.C72453Mb.A0I(r0)
            r1.width = r0
            X.0vl r0 = r15.A0H
            int r0 = X.C72453Mb.A0I(r0)
            r1.height = r0
            X.0vl r0 = r15.A09
            int r0 = X.C72453Mb.A0I(r0)
            r1.topMargin = r0
            r9.setLayoutParams(r1)
            r15.A02 = r9
            r15.A4e()
            return
        L_0x0209:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0210:
            r0 = 0
            r15.setResult(r2, r0)
            r15.finish()
            return
        L_0x0218:
            java.lang.String r0 = "selectedImageAlbumViewModel"
            X.C18070vi.A11(r0)
            throw r3
        L_0x021e:
            java.lang.String r0 = "conversationRowInflaterFactory"
            goto L_0x0226
        L_0x0221:
            java.lang.String r0 = "dropDownMessageSelectionActionRepository"
            goto L_0x0226
        L_0x0224:
            java.lang.String r0 = "bonsaiUiUtilOptional"
        L_0x0226:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80133wd.A4f():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        setResult(0, (Intent) null);
        finish();
    }

    public final FrameLayout A4b() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        C18070vi.A11("selectedMessageContainer");
        throw null;
    }

    public final MessageSelectionDropDownRecyclerView A4c() {
        MessageSelectionDropDownRecyclerView messageSelectionDropDownRecyclerView = this.A05;
        if (messageSelectionDropDownRecyclerView != null) {
            return messageSelectionDropDownRecyclerView;
        }
        C18070vi.A11("messageSelectionDropDownRecyclerView");
        throw null;
    }

    public void A4d() {
        float measuredHeight;
        int x;
        AnonymousClass3uP r5 = this.A02;
        if (r5 != null) {
            C72473Md.A12(A4c(), A4b().getWidth() - C72453Mb.A0I(this.A0F), Integer.MIN_VALUE);
            MessageSelectionDropDownRecyclerView A4c = A4c();
            float y = r5.getY();
            AnonymousClass3uP r2 = this.A02;
            if (r2 == null) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = ((float) r2.getMeasuredHeight()) * r2.getScaleY();
            }
            C18100vl r6 = this.A0A;
            A4c.setY(Math.min(y + measuredHeight + ((float) C72453Mb.A0I(r6)), ((float) A4b().getHeight()) - ((float) (A4c().getMeasuredHeight() + C72453Mb.A0I(r6)))));
            int i = 8388613;
            if (AnonymousClass3MY.A1b(this.A00)) {
                i = 8388611;
            }
            A4b().addView(A4c(), new FrameLayout.LayoutParams(-2, -2, i));
            if (A4g()) {
                View view = r5.A0j;
                x = (((int) view.getX()) + view.getWidth()) - A4c().getMeasuredWidth();
            } else {
                x = (int) r5.A0j.getX();
            }
            MessageSelectionDropDownRecyclerView A4c2 = A4c();
            ViewGroup.LayoutParams layoutParams = A4c2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = x;
                A4c2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public boolean A4g() {
        if (this instanceof SingleSelectedMessageActivity) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) this;
            AnonymousClass3U8 r0 = singleSelectedMessageActivity.A04;
            if (r0 == null) {
                C18070vi.A11("singleSelectedMessageViewModel");
                throw null;
            }
            AnonymousClass206 A0r = AnonymousClass3MX.A0r(r0.A00);
            if (A0r == null || A0r.A0v.A02 != AnonymousClass3MY.A1b(singleSelectedMessageActivity.A00)) {
                return false;
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) this;
            SelectedImageAlbumViewModel selectedImageAlbumViewModel = selectedImageAndVideoAlbumActivity.A00;
            AnonymousClass21V r02 = null;
            if (selectedImageAlbumViewModel == null) {
                C18070vi.A11("selectedImageAlbumViewModel");
                throw null;
            }
            List A10 = AnonymousClass3MW.A10(selectedImageAlbumViewModel.A00);
            if (A10 != null && !A10.isEmpty()) {
                r02 = (AnonymousClass21V) A10.get(0);
            }
            if (r02 == null || r02.A0v.A02 != AnonymousClass3MY.A1b(selectedImageAndVideoAlbumActivity.A00)) {
                return false;
            }
        }
        return true;
    }

    public void A4e() {
        A4b().post(new C98554rL(this, 1));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130772051);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(2130772050, 0);
        if (getIntent() == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        setContentView(2131626873);
        AnonymousClass3MZ.A0F(this).setBackgroundColor(AnonymousClass1YH.A00(getTheme(), getResources(), 2131103241));
        C28281Zt.A05(this, 2131102739);
        C28281Zt.A0A(getWindow(), false);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) AnonymousClass3MY.A0C(this, 2131435124);
        C18070vi.A0d(keyboardPopupLayout, 0);
        this.A01 = keyboardPopupLayout;
        FrameLayout frameLayout = (FrameLayout) AnonymousClass3MY.A0C(this, 2131435122);
        C18070vi.A0d(frameLayout, 0);
        this.A00 = frameLayout;
        C89924dF.A00(A4b(), this, 2);
        C27641Ww.A03(A4b(), C72453Mb.A0I(this.A0J), 0);
    }

    public void onResume() {
        super.onResume();
        this.A06 = getResources().getConfiguration();
    }
}
