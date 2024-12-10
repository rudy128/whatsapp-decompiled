package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1L4;
import X.AnonymousClass1O2;
import X.AnonymousClass1RW;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass210;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NU;
import X.AnonymousClass3t9;
import X.AnonymousClass3u3;
import X.AnonymousClass3u4;
import X.AnonymousClass3u7;
import X.AnonymousClass3u9;
import X.AnonymousClass3uL;
import X.AnonymousClass3uO;
import X.AnonymousClass3uP;
import X.AnonymousClass4H3;
import X.AnonymousClass4RG;
import X.AnonymousClass4Z2;
import X.AnonymousClass4aO;
import X.AnonymousClass5G7;
import X.AnonymousClass8BG;
import X.C000200d;
import X.C108405be;
import X.C127386eG;
import X.C146807Qr;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C200710s;
import X.C26061Qr;
import X.C27231Vg;
import X.C28931bI;
import X.C40051u5;
import X.C60502o8;
import X.C63892tr;
import X.C693536w;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C72913Nz;
import X.C73103Oz;
import X.C78853tn;
import X.C79033uC;
import X.C79093uR;
import X.C86494Rv;
import X.C88304Zd;
import X.C98774rh;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ConversationListView extends ListView implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C19880zA A04;
    public C19880zA A05;
    public AnonymousClass11S A06;
    public AnonymousClass1RW A07;
    public AnonymousClass11P A08;
    public C19830z4 A09;
    public C18030ve A0A;
    public C88304Zd A0B;
    public C26061Qr A0C;
    public AnonymousClass1O2 A0D;
    public C27231Vg A0E;
    public AnonymousClass1L4 A0F;
    public AnonymousClass1DC A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass031 A0K;
    public Runnable A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final Handler A0T;
    public final C40051u5 A0U;
    public final C18100vl A0V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A02();
        this.A0U = new C40051u5();
        this.A0T = AnonymousClass3NU.A00(this);
        this.A0V = AnonymousClass1DF.A01(new AnonymousClass5G7(this));
    }

    public final AnonymousClass3uP A01(AnonymousClass205 r5) {
        AnonymousClass3uP r1;
        AnonymousClass3uL A2i;
        C18070vi.A0d(r5, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AnonymousClass3uP) && (r1 = (AnonymousClass3uP) childAt) != null) {
                if ((r1 instanceof C79033uC) && (A2i = ((C79033uC) r1).A2i(r5)) != null) {
                    r1 = A2i;
                }
                if (r1.A2h(r5)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public final void A09(C86494Rv r3, boolean z) {
        C18070vi.A0d(r3, 0);
        C73103Oz conversationCursorAdapter = getConversationCursorAdapter();
        conversationCursorAdapter.A02 = r3.A00;
        conversationCursorAdapter.A03 = r3.A01;
        conversationCursorAdapter.A04 = r3.A02;
        if (z) {
            conversationCursorAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(getNewsletterConfig()), 11694) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.AnonymousClass3MY.A0W(getNewsletterConfig()), 11693) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.36w r0 = X.C60502o8.A00(r6)
            r4 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x004a
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6 instanceof X.C438421d
            if (r0 == 0) goto L_0x002c
            X.00H r0 = r5.getNewsletterConfig()
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 11693(0x2dad, float:1.6385E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            boolean r0 = r6 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0044
            X.00H r0 = r5.getNewsletterConfig()
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 11694(0x2dae, float:1.6387E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r3 != 0) goto L_0x0049
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationListView.A0E(X.206):boolean");
    }

    public void addFooterView(View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass4aO.A03(view);
        super.addFooterView(view);
    }

    public void addHeaderView(View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass4aO.A03(view);
        super.addHeaderView(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View selectedView;
        C18070vi.A0d(keyEvent, 0);
        if (keyEvent.getKeyCode() != 23 || (selectedView = getSelectedView()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return selectedView.dispatchKeyEvent(keyEvent);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        getSystemFeatures();
        return super.onInterceptHoverEvent(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C18070vi.A0d(parcelable, 0);
        C72913Nz r2 = (C72913Nz) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0P = r2.A02;
        this.A02 = r2.A00;
        this.A03 = r2.A01;
        requestLayout();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final void setAsyncAudioPlayer(C27231Vg r2) {
        C18070vi.A0d(r2, 0);
        this.A0E = r2;
    }

    public final void setBonsaiUtilOptional(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setConversationSessionStateProvider(AnonymousClass1RW r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setConversationsScrollStateCache(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0H = r2;
    }

    public final void setGroupContextCardHelper(C88304Zd r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setImeUtils(AnonymousClass1L4 r2) {
        C18070vi.A0d(r2, 0);
        this.A0F = r2;
    }

    public final void setInFlightMessages(AnonymousClass1O2 r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMessageViewModeManager(C26061Qr r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setMetaAiInternal(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setNewsletterConfig(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setNewsletterMediaDownloadManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A0G = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    private final int getDefaultDividerOffset() {
        return C72453Mb.A0I(this.A0V);
    }

    public void A02() {
        if (!this.A0S) {
            this.A0S = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A0A = AnonymousClass10E.A8r(A0O2);
            this.A0E = (C27231Vg) A0O2.A0N.get();
            this.A04 = AnonymousClass3MZ.A0M(A0O2.A13);
            this.A07 = (AnonymousClass1RW) A0O2.A2u.get();
            this.A0H = C000200d.A00(A0O2.A2w);
            this.A0B = (C88304Zd) A0O2.A4l.get();
            this.A0F = AnonymousClass3Ma.A0w(A0O2.A00);
            this.A0D = (AnonymousClass1O2) A0O2.A57.get();
            this.A06 = AnonymousClass10E.A17(A0O2);
            this.A0C = (C26061Qr) A0O2.A6l.get();
            this.A05 = C19890zB.A00;
            this.A0I = C000200d.A00(A0O2.A7C);
            this.A0J = C000200d.A00(A0O2.Aau);
            this.A0G = AnonymousClass3MZ.A13(A0O2);
            this.A08 = AnonymousClass10E.A6O(A0O2);
            this.A09 = AnonymousClass3Ma.A0c(A0O2);
        }
    }

    public final void A06() {
        if (this.A0Q) {
            A0B(true);
            this.A0Q = false;
        } else if (getLastVisiblePosition() >= getCount() - 2) {
            A0B(true);
        } else {
            smoothScrollBy(AnonymousClass3MW.A01(getResources(), 2131166269), 100);
        }
    }

    public final void A0A(AnonymousClass206 r7, int i, boolean z) {
        boolean z2;
        C73103Oz conversationCursorAdapter;
        HashSet hashSet;
        AnonymousClass205 r2 = r7.A0v;
        C18070vi.A0W(r2);
        AnonymousClass3uP A012 = A01(r2);
        if (A012 != null) {
            if (A012.getFMessage().A0u == r7.A0u) {
                if (i == 8) {
                    A012.A1y();
                    return;
                } else if (i == 12) {
                    A012.A1v();
                    return;
                } else if (i == 20) {
                    getConversationCursorAdapter().A0R.add(r2);
                    return;
                } else {
                    if (i == 27 || i == 28 || i == 39 || i == 40) {
                        AnonymousClass11P time = getTime();
                        AnonymousClass11S meManager = getMeManager();
                        AnonymousClass1O2 inFlightMessages = getInFlightMessages();
                        C18030ve abProps = getAbProps();
                        AnonymousClass8BG A013 = C63892tr.A01(r7);
                        if (A013 == null || AnonymousClass4Z2.A01(meManager, time, abProps, inFlightMessages, A013.BMv()) == null) {
                            A012.A2S(r7, i);
                            A012.A23(A012.A01);
                            if (this.A0M) {
                                A0B(false);
                                return;
                            }
                            return;
                        }
                        z2 = true;
                    } else {
                        if (i == 30) {
                            conversationCursorAdapter = getConversationCursorAdapter();
                            hashSet = conversationCursorAdapter.A0Q;
                        } else if (i == 34) {
                            conversationCursorAdapter = getConversationCursorAdapter();
                            hashSet = conversationCursorAdapter.A0S;
                        } else if (i != 35 || !(A012 instanceof AnonymousClass3u3)) {
                            z2 = true;
                            if (z) {
                                A012.A2J(r7);
                                return;
                            }
                        } else {
                            AnonymousClass3u3 r5 = (AnonymousClass3u3) A012;
                            if (r5.A04 != null && AnonymousClass3u3.A0N(r5)) {
                                AnonymousClass3u3.A0H(r5, new AnonymousClass3t9(r5, 1));
                                return;
                            }
                            return;
                        }
                        hashSet.add(r2);
                        conversationCursorAdapter.notifyDataSetChanged();
                        return;
                    }
                    A012.A2V(r7, z2);
                    return;
                }
            } else if (A012.A2e(r7)) {
                A012.A1u();
                return;
            }
        }
        if (getConversationCursorAdapter().A0R.add(r2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("conversation/refresh: no view for ");
            A10.append(r2.A01);
            A10.append(' ');
            A10.append(getFirstVisiblePosition());
            A10.append('-');
            A10.append(getLastVisiblePosition());
            A10.append('(');
            Log.i(AnonymousClass001.A1L(A10, getCount()));
        }
    }

    public final void A0B(boolean z) {
        if (this.A0N) {
            this.A0O = false;
            this.A0R = false;
        }
        this.A0M = true;
        C98774rh r0 = new C98774rh(this, 9);
        if (z) {
            post(r0);
        } else {
            r0.run();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0K;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C27231Vg getAsyncAudioPlayer() {
        C27231Vg r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("asyncAudioPlayer");
        throw null;
    }

    public final C19880zA getBonsaiUtilOptional() {
        C19880zA r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bonsaiUtilOptional");
        throw null;
    }

    public final AnonymousClass1RW getConversationSessionStateProvider() {
        AnonymousClass1RW r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationSessionStateProvider");
        throw null;
    }

    public final AnonymousClass00H getConversationsScrollStateCache() {
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationsScrollStateCache");
        throw null;
    }

    public final C88304Zd getGroupContextCardHelper() {
        C88304Zd r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupContextCardHelper");
        throw null;
    }

    public final AnonymousClass1L4 getImeUtils() {
        AnonymousClass1L4 r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public final AnonymousClass1O2 getInFlightMessages() {
        AnonymousClass1O2 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inFlightMessages");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C26061Qr getMessageViewModeManager() {
        C26061Qr r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageViewModeManager");
        throw null;
    }

    public final C19880zA getMetaAiInternal() {
        C19880zA r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("metaAiInternal");
        throw null;
    }

    public final AnonymousClass00H getNewsletterConfig() {
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterConfig");
        throw null;
    }

    public final AnonymousClass00H getNewsletterMediaDownloadManager() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterMediaDownloadManager");
        throw null;
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass3uP r1;
        C40051u5 r4 = this.A0U;
        r4.A01();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                r1 = null;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.isPressed() && (childAt instanceof AnonymousClass3uP)) {
                r1 = (AnonymousClass3uP) childAt;
                r1.A2e = true;
                break;
            }
            i5++;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (r1 != null) {
            r1.A2e = false;
        }
        r4.A00();
    }

    public void smoothScrollBy(int i, int i2) {
        if (this.A01 == 0) {
            super.smoothScrollBy(i, i2);
        }
    }

    public void smoothScrollToPosition(int i, int i2) {
        if (this.A01 == 0) {
            super.smoothScrollToPosition(i, i2);
        }
    }

    public void smoothScrollToPositionFromTop(int i, int i2) {
        if (this.A01 == 0) {
            super.smoothScrollToPositionFromTop(i, i2);
        }
    }

    public static final void A00(ConversationListView conversationListView, C28931bI r3, int i, int i2, boolean z) {
        int i3;
        if (conversationListView.getFirstVisiblePosition() >= i || conversationListView.getLastVisiblePosition() <= i) {
            if (z) {
                int i4 = -1;
                if (conversationListView.getFirstVisiblePosition() < i) {
                    i4 = 1;
                }
                i3 = ((i4 * conversationListView.getHeight()) / 4) + i2;
            } else {
                i3 = i2;
            }
            conversationListView.setTranscriptMode(0);
            conversationListView.setSelectionFromTop(i, i3);
            conversationListView.smoothScrollToPositionFromTop(i, i2);
            r3.A04(0);
        }
    }

    private final Activity getActivity() {
        return AnonymousClass3Ma.A05(this);
    }

    private final C127386eG getDisplayedDownloadableMediaMessages() {
        if (C18020vd.A05(C18040vf.A02, getAbProps(), 10747)) {
            return getDisplayedDownloadableMediaMessagesExpanded();
        }
        return getOnlyVisibleDownloadableMediaMessages();
    }

    private final C127386eG getDisplayedDownloadableMediaMessagesExpanded() {
        C693536w A002;
        C73103Oz conversationCursorAdapter = getConversationCursorAdapter();
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        HashSet A123 = C17880vN.A12();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AnonymousClass3u4) {
                List albumMessages = ((AnonymousClass3u7) childAt).getAlbumMessages();
                Iterator it = albumMessages.subList(4, albumMessages.size()).iterator();
                while (it.hasNext()) {
                    C72463Mc.A1L(A123, it);
                }
            }
        }
        int A003 = C18020vd.A00(C18040vf.A02, getAbProps(), 10746);
        int firstVisiblePosition = getFirstVisiblePosition() - A003;
        if (firstVisiblePosition < 0) {
            firstVisiblePosition = 0;
        }
        int lastVisiblePosition = getLastVisiblePosition() + A003;
        while (firstVisiblePosition < lastVisiblePosition) {
            AnonymousClass206 A072 = conversationCursorAdapter.getItem(firstVisiblePosition);
            if (A072 != null && !((AnonymousClass4RG) getNewsletterMediaDownloadManager().get()).A00(A072)) {
                if (A072 instanceof AnonymousClass21V) {
                    if (AnonymousClass4H3.A00((AnonymousClass21V) A072) && !A123.contains(A072.A0v)) {
                        if (A0E(A072)) {
                            A122.add(A072);
                        }
                        C72483Me.A0y(this, A072, A12);
                    }
                } else if ((A072 instanceof AnonymousClass210) && (A002 = C60502o8.A00(A072)) != null && !A002.A0A) {
                    C72483Me.A0y(this, A072, A122);
                }
            }
            firstVisiblePosition++;
        }
        return new C127386eG(A12, A122);
    }

    private final C127386eG getOnlyVisibleDownloadableMediaMessages() {
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AnonymousClass3uP) {
                AnonymousClass206 fMessage = ((C79093uR) childAt).getFMessage();
                C18070vi.A0X(fMessage);
                if (!((AnonymousClass4RG) getNewsletterMediaDownloadManager().get()).A00(fMessage)) {
                    if (childAt instanceof AnonymousClass3uL) {
                        AnonymousClass21V fMessage2 = ((AnonymousClass3uL) childAt).getFMessage();
                        C18070vi.A0X(fMessage2);
                        if (AnonymousClass4H3.A00(fMessage2)) {
                            if (A0E(fMessage2)) {
                                A122.add(fMessage2);
                            }
                            C72483Me.A0y(this, fMessage2, A12);
                        }
                    } else if (childAt instanceof AnonymousClass3uO) {
                        AnonymousClass206 r1 = ((C79093uR) childAt).A0I;
                        C18070vi.A0X(r1);
                        C693536w A002 = C60502o8.A00(r1);
                        if (A002 != null && !A002.A0A) {
                            C72483Me.A0y(this, r1, A122);
                        }
                    } else if (childAt instanceof AnonymousClass3u4) {
                        Iterator it = ((AnonymousClass3u7) childAt).getAlbumMessages().subList(0, 4).iterator();
                        while (it.hasNext()) {
                            AnonymousClass21V A0b = C17880vN.A0b(it);
                            if (AnonymousClass4H3.A00(A0b)) {
                                if (A0E(A0b)) {
                                    A122.add(A0b);
                                }
                                C72483Me.A0y(this, A0b, A12);
                            }
                        }
                    }
                }
            }
        }
        return new C127386eG(A12, A122);
    }

    public final void A03() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C108405be) {
                ((C108405be) childAt).CNi();
            }
        }
    }

    public final void A04() {
        if (getConversationCursorAdapter().getCursor() != null) {
            AnonymousClass4RG r4 = (AnonymousClass4RG) getNewsletterMediaDownloadManager().get();
            C127386eG displayedDownloadableMediaMessages = getDisplayedDownloadableMediaMessages();
            C200710s r2 = (C200710s) r4.A04.getValue();
            r2.A03();
            r2.execute(new C146807Qr(r4, displayedDownloadableMediaMessages, 39));
        }
    }

    public final void A05() {
        getConversationCursorAdapter().notifyDataSetChanged();
        if (this.A0N) {
            this.A0O = false;
            this.A0R = false;
        }
    }

    public final void A07() {
        int A042;
        C73103Oz conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter.getCursor() != null) {
            if (conversationCursorAdapter.A0L.A0w("fmx_card_view_pending_chats").contains(conversationCursorAdapter.A0N.toString())) {
                A042 = 0;
            } else {
                A042 = conversationCursorAdapter.A04();
            }
            int A0I2 = C72453Mb.A0I(this.A0V);
            conversationCursorAdapter.A04();
            setTranscriptMode(0);
            setSelectionFromTop(A042 + getHeaderViewsCount(), A0I2);
            this.A0O = false;
            this.A0N = false;
        }
    }

    public final void A08(Cursor cursor) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("conversationListView/changeCursor/size: ");
        Log.w(C17880vN.A0t(A10, cursor.getCount()));
        C73103Oz conversationCursorAdapter = getConversationCursorAdapter();
        if (!cursor.isClosed()) {
            conversationCursorAdapter.A0J.clear();
            conversationCursorAdapter.changeCursor(cursor);
        }
    }

    public final boolean A0C() {
        C18030ve A0W = AnonymousClass3MY.A0W(getNewsletterConfig());
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, A0W, 11693) || C18020vd.A05(r2, AnonymousClass3MY.A0W(getNewsletterConfig()), 11694)) {
            return true;
        }
        return false;
    }

    public final boolean A0D(int i) {
        if (getLastVisiblePosition() < (getHeaderViewsCount() + getConversationCursorAdapter().getCount()) - 1 || getChildCount() == 0) {
            return false;
        }
        View lastRow = getLastRow();
        C18070vi.A0b(lastRow);
        int bottom = lastRow.getBottom();
        if (bottom < getHeight() || (bottom >= getHeight() && bottom <= getHeight() + i)) {
            return true;
        }
        return false;
    }

    public final int getAdjustedVisibleItemCount() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View lastRow = getLastRow();
        if ((lastRow instanceof AnonymousClass3u9) || (lastRow instanceof C78853tn)) {
            return 0 + (((AnonymousClass3uP) lastRow).getMessageCount() - 1);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r1 instanceof X.C73103Oz) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C73103Oz getConversationCursorAdapter() {
        /*
            r2 = this;
            android.widget.ListAdapter r1 = r2.getAdapter()
            boolean r0 = r1 instanceof X.C73103Oz
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0019
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            boolean r0 = r1 instanceof X.C73103Oz
            if (r0 == 0) goto L_0x0019
        L_0x0016:
            X.3Oz r1 = (X.C73103Oz) r1
            return r1
        L_0x0019:
            java.lang.String r0 = "Unknown adapter type"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationListView.getConversationCursorAdapter():X.3Oz");
    }

    public final View getLastRow() {
        return getChildAt(getChildCount() - 1);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        C18070vi.A0i(view, accessibilityNodeInfo);
        ListAdapter adapter = getAdapter();
        if (i != -1 && adapter != null) {
            if (i >= adapter.getCount()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:");
                A10.append(i);
                A10.append(" count:");
                Log.w(C17880vN.A0t(A10, adapter.getCount()));
                return;
            }
            super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        }
    }

    public void onMeasure(int i, int i2) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C18070vi.A0b(onSaveInstanceState);
        return new C72913Nz(onSaveInstanceState, this.A02, this.A03, this.A0P);
    }

    public final void setCurrentScrollState(int i) {
        this.A01 = i;
    }

    public final void setScrollToBottom(boolean z) {
        this.A0Q = z;
    }

    public final void setScrollToTop(boolean z) {
        this.A0R = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A02();
        this.A0U = new C40051u5();
        this.A0T = AnonymousClass3NU.A00(this);
        this.A0V = AnonymousClass1DF.A01(new AnonymousClass5G7(this));
    }

    public void addFooterView(View view, Object obj, boolean z) {
        C18070vi.A0d(view, 0);
        AnonymousClass4aO.A03(view);
        super.addFooterView(view, obj, z);
    }

    public void addHeaderView(View view, Object obj, boolean z) {
        C18070vi.A0d(view, 0);
        AnonymousClass4aO.A03(view);
        super.addHeaderView(view, obj, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A02();
        this.A0U = new C40051u5();
        this.A0T = AnonymousClass3NU.A00(this);
        this.A0V = AnonymousClass1DF.A01(new AnonymousClass5G7(this));
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A02();
        this.A0U = new C40051u5();
        this.A0T = AnonymousClass3NU.A00(this);
        this.A0V = AnonymousClass1DF.A01(new AnonymousClass5G7(this));
    }
}
