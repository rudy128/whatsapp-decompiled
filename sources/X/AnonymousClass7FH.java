package X;

import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryViewModel$refreshStarAction$1;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.7FH  reason: invalid class name */
public class AnonymousClass7FH implements AnonymousClass1WR {
    public final int A00;
    public final Object A01;

    public AnonymousClass7FH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r2) {
        if (9 - this.A00 == 0 && C22971Dz.A0a(r2)) {
            ((StatusesFragment) this.A01).A27();
        }
    }

    public /* synthetic */ void ByH(AnonymousClass206 r6, int i) {
        List list;
        StatusPlaybackProgressView statusPlaybackProgressView;
        switch (this.A00) {
            case 1:
                if (r6 instanceof C436420i) {
                    C143087By r2 = (C143087By) this.A01;
                    if (r2.A0I.equals(r6.A0v.A00)) {
                        int i2 = ((C436420i) r6).A00;
                        if ((i2 == 5 || i2 == 7) && r2.A0y.A0O(r6.A0H())) {
                            r2.A05.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                AnonymousClass205 r1 = r6.A0v;
                if (C108945cZ.A1S(r1)) {
                    StatusesFragment statusesFragment = (StatusesFragment) this.A01;
                    statusesFragment.A27();
                    if (r1.A02) {
                        if (!(statusesFragment.A02 == null || statusesFragment.A1n() == null)) {
                            statusesFragment.A0T.A16();
                            statusesFragment.A02.setVisibility(8);
                        }
                        statusesFragment.A0m.A05(statusesFragment.A14(), r6);
                        return;
                    }
                    statusesFragment.A1P.remove(r6.A0I());
                    return;
                }
                return;
            case 10:
                if (C108965cb.A0U(r6).A02) {
                    ((AdvertiseViewModel) this.A01).A0T();
                    return;
                }
                return;
            case 11:
                AnonymousClass205 A0U = C108965cb.A0U(r6);
                if (C108945cZ.A1S(A0U) && A0U.A02) {
                    MyStatusesActivity.A10((MyStatusesActivity) this.A01);
                    return;
                }
                return;
            case 12:
                C18070vi.A0d(r6, 0);
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A01;
                if (statusPlaybackContactFragment.A12) {
                    if (C18020vd.A05(C18040vf.A02, statusPlaybackContactFragment.A2C().A01, 10540)) {
                        AnonymousClass205 r12 = r6.A0v;
                        if (C108945cZ.A1S(r12) && r12.A02 && (list = statusPlaybackContactFragment.A0w) != null) {
                            list.add(r6);
                            C131096kV r0 = statusPlaybackContactFragment.A05;
                            if (r0 != null && (statusPlaybackProgressView = r0.A0E) != null) {
                                statusPlaybackProgressView.setCount(list.size());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                AnonymousClass205 A0U2 = C108965cb.A0U(r6);
                AnonymousClass1BI r3 = A0U2.A00;
                C29681ch r22 = null;
                if (r3 instanceof C29681ch) {
                    r22 = (C29681ch) r3;
                }
                C131026kO r13 = (C131026kO) this.A01;
                if (C22971Dz.A0a(r3) && A0U2.A02) {
                    UpdatesViewModel.A0D(r13.A0A);
                    return;
                } else if (r22 != null) {
                    r13.A0A.A0W(r22, AnonymousClass00R.A00);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0100, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0E, 7497) != false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void ByK(X.AnonymousClass206 r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 2: goto L_0x0238;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01ba;
                case 5: goto L_0x0005;
                case 6: goto L_0x01ac;
                case 7: goto L_0x0005;
                case 8: goto L_0x0183;
                case 9: goto L_0x011f;
                case 10: goto L_0x010b;
                case 11: goto L_0x00d1;
                case 12: goto L_0x005d;
                case 13: goto L_0x0005;
                case 14: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            boolean r0 = X.AnonymousClass25A.A0p(r9)
            if (r0 != 0) goto L_0x0005
            X.205 r2 = r9.A0v
            X.1BI r1 = r2.A00
            boolean r0 = r1 instanceof X.C29681ch
            if (r0 == 0) goto L_0x005b
            r3 = r1
            X.1ch r3 = (X.C29681ch) r3
        L_0x001b:
            java.lang.Object r4 = r8.A01
            X.6kO r4 = (X.C131026kO) r4
            boolean r0 = X.C22971Dz.A0a(r1)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0051
            com.whatsapp.updates.viewmodels.UpdatesViewModel r2 = r4.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            if (r1 == 0) goto L_0x004e
            r0 = 8
            int r1 = r1.intValue()
            if (r1 == r0) goto L_0x0051
            r0 = -1
            if (r1 > r0) goto L_0x004e
            X.1DT r0 = r2.A0O
            java.lang.Object r0 = r0.A06()
            X.6nQ r0 = (X.C132706nQ) r0
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0051
        L_0x004e:
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0D(r2)
        L_0x0051:
            if (r3 == 0) goto L_0x0005
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r4.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A0W(r3, r0)
            return
        L_0x005b:
            r3 = 0
            goto L_0x001b
        L_0x005d:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.Object r5 = r8.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r5 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r5
            java.util.List r0 = r5.A0w
            if (r0 == 0) goto L_0x0005
            com.whatsapp.jid.UserJid r1 = r5.A0N
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 != r0) goto L_0x0005
            X.205 r4 = r9.A0v
            boolean r0 = X.C108945cZ.A1S(r4)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0005
            X.6kV r3 = r5.A05
            if (r3 == 0) goto L_0x0088
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0E
            if (r0 == 0) goto L_0x0088
            java.util.Set r0 = r0.A04
            r0.clear()
        L_0x0088:
            java.util.List r0 = r5.A0w
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r7 = r0.iterator()
            r2 = 0
        L_0x0091:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r6 = X.C17880vN.A0Y(r7)
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00bf
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 == 0) goto L_0x00bf
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x00bf
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x00bf
            if (r3 == 0) goto L_0x00bf
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0E
            if (r0 == 0) goto L_0x00bf
            java.util.Set r1 = r0.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
        L_0x00bf:
            int r0 = r5.A00
            if (r2 != r0) goto L_0x00ce
            X.205 r0 = r6.A0v
            boolean r0 = X.C18070vi.A18(r0, r4)
            if (r0 == 0) goto L_0x00ce
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A06(r9, r5)
        L_0x00ce:
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00d1:
            X.205 r1 = X.C108965cb.A0U(r9)
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0005
            int r1 = r9.A0D()
            r0 = 4
            int r0 = X.C446824j.A00(r1, r0)
            if (r0 > 0) goto L_0x0102
            java.lang.Object r3 = r8.A01
            com.whatsapp.status.playback.MyStatusesActivity r3 = (com.whatsapp.status.playback.MyStatusesActivity) r3
            r0 = 28
            if (r10 == r0) goto L_0x00f6
            r0 = 27
            if (r10 != r0) goto L_0x0273
        L_0x00f6:
            X.0ve r2 = r3.A0E
            r1 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0273
        L_0x0102:
            java.lang.Object r1 = r8.A01
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            r0 = 1
            com.whatsapp.status.playback.MyStatusesActivity.A0y(r9, r1, r0)
            return
        L_0x010b:
            X.205 r0 = X.C108965cb.A0U(r9)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0005
            r0 = 24
            if (r10 != r0) goto L_0x0005
            java.lang.Object r0 = r8.A01
            com.whatsapp.status.advertise.AdvertiseViewModel r0 = (com.whatsapp.status.advertise.AdvertiseViewModel) r0
            r0.A0T()
            return
        L_0x011f:
            X.205 r1 = r9.A0v
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0005
            r0 = 8
            if (r10 == r0) goto L_0x0005
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0177
            java.lang.Object r5 = r8.A01
            com.whatsapp.status.StatusesFragment r5 = (com.whatsapp.status.StatusesFragment) r5
            X.6yN r0 = r5.A0k
            X.2sx r0 = r0.A00
            if (r0 == 0) goto L_0x0177
            X.6LR r0 = r5.A0n
            X.C17890vO.A0t(r0)
            X.1TG r0 = r5.A0W
            X.6LR r1 = new X.6LR
            r1.<init>(r0, r5)
            r5.A0n = r1
            X.10I r0 = r5.A0p
            X.C17890vO.A0u(r1, r0)
            long r3 = r9.A0H
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            X.1x0 r1 = r5.A0m
            android.content.Context r0 = r5.A14()
            r1.A06(r0, r9, r5)
            return
        L_0x015e:
            boolean r0 = r9 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0005
            r0 = r9
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0005
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0005
            X.1x0 r0 = r5.A0m
            r0.A07(r9)
            return
        L_0x0177:
            r0 = 12
            if (r10 != r0) goto L_0x0005
            java.lang.Object r0 = r8.A01
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A27()
            return
        L_0x0183:
            java.lang.Object r3 = r8.A01
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r3 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r3
            X.1kk r0 = r3.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0005
            android.os.Handler r2 = r3.A07
            java.lang.Runnable r0 = r3.A0A
            r2.removeCallbacks(r0)
            android.app.job.JobParameters r1 = r3.A00
            if (r1 == 0) goto L_0x01a1
            r0 = 0
            r3.jobFinished(r1, r0)
            r0 = 0
            r3.A00 = r0
        L_0x01a1:
            r1 = 35
            X.7Qo r0 = new X.7Qo
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.post(r0)
            return
        L_0x01ac:
            boolean r0 = r9 instanceof X.C441822l
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r8.A01
            X.5jU r0 = (X.C111295jU) r0
            X.1Dg r0 = r0.A0Z
            r0.A0F(r9)
            return
        L_0x01ba:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r0 = 8
            if (r10 == r0) goto L_0x0005
            X.205 r0 = r9.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0R(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            java.lang.Object r1 = r8.A01
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            if (r10 != r0) goto L_0x0277
            X.1KB r3 = r1.A05
            r0 = 32
            X.7Qn r2 = new X.7Qn
            r2.<init>(r1, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0K(r2, r0)
            return
        L_0x01e2:
            java.lang.Object r2 = r8.A01
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A0s
            X.205 r4 = r9.A0v
            android.view.View r1 = r0.findViewWithTag(r4)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x020e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 0
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x020e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof X.AnonymousClass3uP
            if (r0 == 0) goto L_0x020e
            X.3uP r1 = (X.AnonymousClass3uP) r1
            if (r1 == 0) goto L_0x020e
            r1.A1u()
        L_0x020e:
            int r1 = r9.A0u
            r0 = 20
            if (r1 != r0) goto L_0x0005
            java.util.List r0 = r2.A1L
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r10 != r0) goto L_0x0005
            com.whatsapp.notification.PopupNotificationViewPager r0 = r2.A0s
            android.view.View r1 = r0.findViewWithTag(r4)
            if (r1 == 0) goto L_0x0005
            r0 = 2131433984(0x7f0b1a00, float:1.848977E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x0005
            X.22g r9 = (X.C441322g) r9
            com.whatsapp.notification.PopupNotification.A0t(r2, r9, r0)
            return
        L_0x0238:
            boolean r0 = r9 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r10 != r0) goto L_0x0005
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/messageObserver/onMessageChanged "
            r1.append(r0)
            X.205 r4 = r9.A0v
            X.C17900vP.A0b(r4, r1)
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            X.21V r9 = (X.AnonymousClass21V) r9
            com.whatsapp.mediaview.MediaViewFragment.A0e(r3, r9)
            boolean r0 = r3.A1h
            if (r0 == 0) goto L_0x0005
            com.whatsapp.mediaview.PhotoView r2 = r3.A28(r4)
            if (r2 == 0) goto L_0x0005
            X.7RT r0 = r3.A0B
            if (r0 == 0) goto L_0x0005
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/messageObserver/onMessageChanged photoLoader.queueImage "
            X.C17900vP.A0Y(r4, r0, r1)
            X.7RT r0 = r3.A0B
            r0.A01(r2, r9)
            return
        L_0x0273:
            com.whatsapp.status.playback.MyStatusesActivity.A0z(r3)
            return
        L_0x0277:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.CDp(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.CDp(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FH.ByK(X.206, int):void");
    }

    public /* synthetic */ void ByN(AnonymousClass206 r3) {
        if (11 - this.A00 == 0) {
            AnonymousClass205 A0U = C108965cb.A0U(r3);
            if (C108945cZ.A1S(A0U) && A0U.A02) {
                MyStatusesActivity.A0y(r3, (MyStatusesActivity) this.A01, true);
            }
        }
    }

    public /* synthetic */ void ByR(AnonymousClass206 r4) {
        if (9 - this.A00 == 0 && C22971Dz.A0g(r4)) {
            StatusesFragment statusesFragment = (StatusesFragment) this.A01;
            statusesFragment.A1P.add(r4.A0I());
            statusesFragment.A27();
        }
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        if (6 - this.A00 != 0) {
            AnonymousClass2TK.A00(this, collection, i);
            return;
        }
        for (Object next : collection) {
            if (next instanceof C441822l) {
                ((C111295jU) this.A01).A0Z.A0F(next);
            }
        }
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r3) {
        switch (this.A00) {
            case 5:
                C134156q8 r1 = (C134156q8) this.A01;
                r1.A01(AnonymousClass000.A1P(r1.A0D.A02));
                return;
            case 7:
                C130916kD r0 = (C130916kD) this.A01;
                r0.A02.A0F(r0.A08);
                return;
            case 9:
                if (C22971Dz.A0a(r3)) {
                    ((StatusesFragment) this.A01).A27();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f4, code lost:
        if (r1 == null) goto L_0x01f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bya(java.util.Collection r14, java.util.Map r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            r6 = r14
            switch(r0) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0006;
                case 2: goto L_0x0193;
                case 3: goto L_0x0006;
                case 4: goto L_0x0006;
                case 5: goto L_0x0167;
                case 6: goto L_0x0006;
                case 7: goto L_0x0279;
                case 8: goto L_0x0006;
                case 9: goto L_0x0124;
                case 10: goto L_0x0100;
                case 11: goto L_0x00dc;
                case 12: goto L_0x003d;
                case 13: goto L_0x0253;
                case 14: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            java.util.ArrayList r3 = X.C72463Mc.A0s(r14)
            java.util.Iterator r2 = r14.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x000f
            r3.add(r1)
            goto L_0x000f
        L_0x0026:
            java.lang.Object r2 = r13.A01
            X.6kO r2 = (X.C131026kO) r2
            java.util.Iterator r1 = r3.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            r1.next()
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r2.A0A
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0D(r0)
            goto L_0x002e
        L_0x003d:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.Object r8 = r13.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r8 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r8
            java.util.List r10 = r8.A0w
            if (r10 == 0) goto L_0x0006
            int r11 = r8.A00
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r14.iterator()
        L_0x0053:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r1 = r0.A0v
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x006c
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0053
        L_0x006c:
            r4.add(r2)
            goto L_0x0053
        L_0x0070:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r4.iterator()
        L_0x0078:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a8
            X.205 r3 = X.AnonymousClass3MZ.A10(r4)
            X.C18070vi.A0W(r3)
            java.util.List r0 = r8.A0w
            if (r0 == 0) goto L_0x0078
            java.util.Iterator r2 = r0.iterator()
        L_0x008d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r0 = r0.A0v
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x0078
            r5.add(r1)
            goto L_0x0078
        L_0x00a8:
            java.util.Iterator r2 = r5.iterator()
            r1 = 0
        L_0x00ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r2.next()
            int r1 = r10.indexOf(r0)
            if (r1 < 0) goto L_0x00c7
            r10.remove(r1)
            int r0 = r8.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            int r11 = r11 - r0
        L_0x00c7:
            r1 = 1
            goto L_0x00ad
        L_0x00c9:
            if (r1 == 0) goto L_0x0006
            X.1KB r0 = r8.A00
            if (r0 == 0) goto L_0x0285
            r12 = 4
            X.7Px r7 = new X.7Px
            r9 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            android.os.Handler r0 = r0.A02
            r0.post(r7)
            return
        L_0x00dc:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.util.Iterator r2 = r14.iterator()
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0006
            X.205 r1 = X.AnonymousClass3MZ.A10(r2)
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r13.A01
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A10(r0)
            return
        L_0x0100:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0006
            java.util.Iterator r1 = r14.iterator()
        L_0x010e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            X.205 r0 = X.AnonymousClass3MZ.A10(r1)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r13.A01
            com.whatsapp.status.advertise.AdvertiseViewModel r0 = (com.whatsapp.status.advertise.AdvertiseViewModel) r0
            r0.A0T()
            return
        L_0x0124:
            java.util.Iterator r5 = r14.iterator()
            r4 = 0
        L_0x0129:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0006
            X.206 r3 = X.C17880vN.A0Y(r5)
            X.205 r1 = r3.A0v
            boolean r0 = X.C108945cZ.A1S(r1)
            if (r0 == 0) goto L_0x0129
            if (r4 != 0) goto L_0x0145
            java.lang.Object r0 = r13.A01
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A27()
            r4 = 1
        L_0x0145:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r13.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.00H r0 = r1.A0w
            boolean r0 = X.C108985cd.A1Z(r0)
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.AnonymousClass25A.A0p(r3)
            if (r0 != 0) goto L_0x0129
            X.1hg r0 = r1.A0l
            X.2tc r2 = X.C108965cb.A0Y(r0)
            r1 = 5
            r0 = 0
            r2.A04(r3, r0, r0, r1)
            goto L_0x0129
        L_0x0167:
            java.lang.Object r0 = r13.A01
            X.6q8 r0 = (X.C134156q8) r0
            X.1Dg r3 = r0.A01
            java.lang.Object r2 = r3.A06()
            X.6yD r2 = (X.C139096yD) r2
            if (r2 == 0) goto L_0x0006
            java.util.List r0 = r2.A04
            r0.removeAll(r14)
            java.util.List r0 = r2.A02
            r0.removeAll(r14)
            java.util.List r0 = r2.A03
            r0.removeAll(r14)
            java.util.List r1 = r2.A01
            java.lang.Class<X.21V> r0 = X.AnonymousClass21V.class
            java.util.List r0 = X.C29421cF.A0R(r0, r14)
            r1.removeAll(r0)
            r3.A0E(r2)
            return
        L_0x0193:
            java.lang.Object r3 = r13.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.util.Iterator r4 = r14.iterator()
        L_0x019b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0006
            X.206 r2 = X.C17880vN.A0Y(r4)
            X.205 r5 = r2.A0v
            X.1BI r1 = r5.A00
            if (r1 == 0) goto L_0x019b
            X.1BI r0 = r3.A0g
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x019b
            int r1 = r2.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r1)
            if (r0 != 0) goto L_0x01c1
            boolean r0 = X.AnonymousClass25A.A0I(r1)
            if (r0 == 0) goto L_0x019b
        L_0x01c1:
            X.8Aj r0 = r3.A0m
            if (r0 == 0) goto L_0x01f6
            int r0 = r0.getCount()
            r4 = 1
            if (r0 == r4) goto L_0x01f6
            X.87Z r0 = r3.A0o
            if (r0 == 0) goto L_0x01f6
            int r0 = r3.A04
            X.21V r1 = com.whatsapp.mediaview.MediaViewFragment.A04(r3, r0)
            int r2 = r3.A04
            if (r1 == 0) goto L_0x0006
            X.205 r0 = r1.A0v
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01fd
            int r1 = r3.A04
            X.8Aj r0 = r3.A0m
            int r0 = r0.getCount()
            int r0 = r0 - r4
            int r2 = r3.A04
            if (r1 != r0) goto L_0x01fa
            int r2 = r2 - r4
        L_0x01f0:
            X.21V r1 = com.whatsapp.mediaview.MediaViewFragment.A04(r3, r2)
            if (r1 != 0) goto L_0x01fd
        L_0x01f6:
            r3.A2D()
            return
        L_0x01fa:
            int r2 = r2 + 1
            goto L_0x01f0
        L_0x01fd:
            X.8Aj r0 = r3.A0m
            if (r0 == 0) goto L_0x0204
            r0.close()
        L_0x0204:
            X.87Z r0 = r3.A0o
            X.8Aj r1 = r0.BHd(r1)
            r3.A0m = r1
            r0 = 22
            X.3Br r0 = X.C108945cZ.A0X(r3, r0)
            r1.CId(r0)
            r1.CQZ(r2)
            boolean r0 = r3.A1l
            if (r0 != 0) goto L_0x0221
            X.8Aj r0 = r3.A0m
            r0.CNr()
        L_0x0221:
            X.1FL r0 = r3.A1B()
            if (r0 == 0) goto L_0x0006
            X.5rJ r0 = r3.A08
            if (r0 == 0) goto L_0x0006
            r0.A04()
            return
        L_0x022f:
            java.util.Iterator r3 = r14.iterator()
        L_0x0233:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0006
            X.205 r0 = X.AnonymousClass3MZ.A10(r3)
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x0233
            java.lang.Object r2 = r13.A01
            com.whatsapp.gallery.MediaGalleryFragment r2 = (com.whatsapp.gallery.MediaGalleryFragment) r2
            X.1BI r0 = r2.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0233
            r1 = 0
            r0 = 1
            r2.A2F(r1, r0)
            return
        L_0x0253:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.Object r1 = r13.A01
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r1 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r1
            X.0vl r0 = r1.A0G
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel r5 = (com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel) r5
            X.1BI r4 = r1.A06
            X.8Ah r3 = r1.A0G
            X.7H7 r3 = (X.AnonymousClass7H7) r3
            boolean r8 = r1.A0S
            X.1OX r0 = X.C41561wd.A00(r5)
            r7 = 0
            com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel$deleteMedia$1 r2 = new com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel$deleteMedia$1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass3MX.A1Q(r2, r0)
            return
        L_0x0279:
            java.lang.Object r0 = r13.A01
            X.6kD r0 = (X.C130916kD) r0
            X.1Dg r1 = r0.A02
            X.1jz r0 = r0.A08
            r1.A0E(r0)
            return
        L_0x0285:
            X.AnonymousClass3MW.A1C()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FH.Bya(java.util.Collection, java.util.Map):void");
    }

    public void Byc(AnonymousClass1BI r11, Collection collection, boolean z) {
        List list;
        switch (this.A00) {
            case 0:
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A01;
                AnonymousClass7H7 r5 = (AnonymousClass7H7) mediaGalleryFragment.A0G;
                if (r5 != null) {
                    if (collection != null && !collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass1BI r1 = AnonymousClass3MZ.A10(it).A00;
                            if (r1 == null || !r1.equals(mediaGalleryFragment.A04)) {
                            }
                        }
                        return;
                    } else if (r11 != null && !r11.equals(mediaGalleryFragment.A04)) {
                        return;
                    }
                    MediaGalleryViewModel mediaGalleryViewModel = mediaGalleryFragment.A03;
                    if (mediaGalleryViewModel != null) {
                        AnonymousClass3MW.A1X(mediaGalleryViewModel.A01, new MediaGalleryViewModel$refreshStarAction$1(r5, mediaGalleryViewModel, (C30391dr) null), C41561wd.A00(mediaGalleryViewModel));
                        return;
                    }
                    r5.CFP();
                    mediaGalleryFragment.A08.CGP(C146747Ql.A00(mediaGalleryFragment, 37));
                    return;
                }
                return;
            case 5:
                C22801Dg r4 = ((C134156q8) this.A01).A01;
                C139096yD r3 = (C139096yD) r4.A06();
                if (r3 != null && collection != null) {
                    if (z) {
                        r3.A04.removeAll(collection);
                        list = r3.A03;
                    } else {
                        r3.A03.removeAll(collection);
                        list = r3.A04;
                    }
                    C18070vi.A0d(list, 0);
                    TreeSet treeSet = new TreeSet(C124456Yk.A00);
                    treeSet.addAll(list);
                    C29401cD.A0J(collection, treeSet);
                    list.clear();
                    list.addAll(treeSet);
                    r4.A0E(r3);
                    return;
                }
                return;
            case 6:
                ((C111295jU) this.A01).A0e.A0F(collection);
                return;
            case 13:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01;
                AnonymousClass7H7 r6 = (AnonymousClass7H7) mediaGalleryFragmentBase.A0G;
                if (r6 != null && collection != null) {
                    int count = r6.getCount();
                    Iterator it2 = collection.iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        AnonymousClass206 A0Y = C17880vN.A0Y(it2);
                        int i = 0;
                        while (true) {
                            if (i < count) {
                                AnonymousClass7H2 r12 = (AnonymousClass7H2) AnonymousClass000.A0w(r6.A05, i);
                                if (!(r12 == null || r12.A01 == null)) {
                                    AnonymousClass21V r2 = r12.A01;
                                    if (r2.A0v.equals(A0Y.A0v)) {
                                        r2.A0q = z;
                                        z2 = true;
                                    }
                                }
                                i++;
                            }
                        }
                    }
                    if (z2) {
                        mediaGalleryFragmentBase.A2B();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BzA(C29681ch r3, boolean z) {
        if (14 - this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            ((C131026kO) this.A01).A0A.A0W(r3, AnonymousClass00R.A0N);
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }
}
