package X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.HeroPlaybackControlView;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.70X  reason: invalid class name */
public abstract class AnonymousClass70X {
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 5;
    public Activity A02;
    public AudioManager.OnAudioFocusChangeListener A03;
    public Pair A04 = null;
    public AnonymousClass11C A05;
    public AnonymousClass88N A06;
    public AnonymousClass88O A07;
    public AnonymousClass88P A08;
    public AnonymousClass88Q A09;
    public AnonymousClass88R A0A;
    public AnonymousClass88S A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public /* synthetic */ void A0N(int i) {
        C122076Mr r1 = (C122076Mr) this;
        C26378Cye cye = r1.A06;
        if (cye != null) {
            cye.A0G(0, (long) i);
        } else {
            r1.A04 = C17890vO.A0E(0, i);
        }
    }

    public static AnonymousClass70X A04(Context context, AnonymousClass190 r16, AnonymousClass1KB r17, AnonymousClass11C r18, AnonymousClass118 r19, C18030ve r20, AnonymousClass6gC r21, AnonymousClass10I r22, C135056ra r23, File file, boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        boolean z5 = z3;
        if (z2) {
            C18030ve r9 = r20;
            C18070vi.A0d(r9, 0);
            if (!C108985cd.A1V(r9)) {
                AnonymousClass6gC r10 = r21;
                C17960vV.A07(r10);
                C122076Mr r3 = new C122076Mr(AnonymousClass1L9.A00(context), r16, r17, r18, r19, r9, r10, r22, r23, 0, z5);
                r3.A04 = Uri.fromFile(file);
                r3.A0D = z4;
                r3.A0G();
                r3.A0C = true;
                return r3;
            }
        }
        String absolutePath = file.getAbsolutePath();
        if (!z3) {
            return new C122056Mp(context, absolutePath, z4);
        }
        return new C122046Mo(context, absolutePath, z4);
    }

    public int A05() {
        if (this instanceof C122076Mr) {
            C26378Cye cye = ((C122076Mr) this).A06;
            if (cye != null) {
                return (int) cye.A09();
            }
            return 0;
        } else if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00.getCurrentPosition();
        } else {
            if (this instanceof C122046Mo) {
                return ((C122046Mo) this).A00.getCurrentPosition();
            }
            if (this instanceof C122086Ms) {
                return ((C122086Ms) this).A01;
            }
            if (this instanceof C122036Mn) {
                throw new UnsupportedOperationException("not implemented yet");
            }
            C136026t9 r0 = ((C122066Mq) this).A00;
            if (r0 != null) {
                return (int) r0.A00();
            }
            C18070vi.A11("staticContentPlayer");
            throw null;
        }
    }

    public int A06() {
        long j;
        if (this instanceof C122076Mr) {
            C26378Cye cye = ((C122076Mr) this).A06;
            if (cye == null) {
                return 0;
            }
            j = C108965cb.A0E(cye).A0X;
            if (j < 0) {
                j = -1;
            }
        } else if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00.getDuration();
        } else {
            if (this instanceof C122046Mo) {
                return ((C122046Mo) this).A00.getDuration();
            }
            if (this instanceof C122086Ms) {
                j = ((C122086Ms) this).A04;
                if (j == -9223372036854775807L) {
                    return 0;
                }
            } else if (this instanceof C122036Mn) {
                return ((C122036Mn) this).A03.A00.getDuration();
            } else {
                C136026t9 r0 = ((C122066Mq) this).A00;
                if (r0 != null) {
                    return (int) r0.A00;
                }
                C18070vi.A11("staticContentPlayer");
                throw null;
            }
        }
        return (int) j;
    }

    public int A07() {
        UnsupportedOperationException unsupportedOperationException;
        long j;
        C25238CbZ cbZ;
        if (this instanceof C122076Mr) {
            C26378Cye cye = ((C122076Mr) this).A06;
            if (cye == null) {
                return 0;
            }
            if (!C26378Cye.A07(cye) || ((cbZ = cye.A0D.A05) != null && cbZ.A00())) {
                C26270CwF cwF = cye.A0D;
                j = 0;
                try {
                    C26378Cye cye2 = cwF.A0B;
                    if (!AnonymousClass000.A1O((cye2.A0N > 0 ? 1 : (cye2.A0N == 0 ? 0 : -1)))) {
                        C26378Cye.A06(cye2, "Before retrieveCurrentPosition(), service player was evicted. Skip refreshing service player state", new Object[0]);
                    } else {
                        C26204Cub A002 = C26270CwF.A00(cwF);
                        long j2 = cye2.A0N;
                        Object[] A1a = AnonymousClass3MW.A1a();
                        AnonymousClass3MX.A1S(A1a, 0, j2);
                        C25905CoJ.A02("id [%d]: retrieveCurrentPosition", A1a);
                        C26381Cyh A003 = A002.A0U.A00(j2);
                        if (A003 != null) {
                            j = A003.A0M();
                            if (j < 0) {
                                j = 0;
                            }
                        }
                    }
                } catch (RemoteException e) {
                    C26378Cye.A05(cwF.A0B, "Error occurs while refresh service player state", e, new Object[0]);
                    j = 0;
                }
            } else {
                j = cye.A0O;
            }
            return (int) j;
        } else if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00.getCurrentPosition();
        } else {
            if (this instanceof C122046Mo) {
                return ((C122046Mo) this).A00.getCurrentPosition();
            }
            if (this instanceof C122086Ms) {
                unsupportedOperationException = new UnsupportedOperationException("Not supported");
            } else {
                boolean z = this instanceof C122036Mn;
                unsupportedOperationException = new UnsupportedOperationException("Not supported");
                if (z) {
                    throw unsupportedOperationException;
                }
            }
            throw unsupportedOperationException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A08() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x0014
            r1 = r6
            X.6Mr r1 = (X.C122076Mr) r1
            boolean r0 = r1.A0Z()
            if (r0 == 0) goto L_0x0084
            X.6Mw r0 = r1.A0a
            android.graphics.Bitmap r0 = r0.getCurrentFrame()
            return r0
        L_0x0014:
            boolean r0 = r6 instanceof X.C122056Mp
            if (r0 == 0) goto L_0x0022
            r0 = r6
            X.6Mp r0 = (X.C122056Mp) r0
            X.6Mi r0 = r0.A00
            android.graphics.Bitmap r0 = r0.getBitmap()
            return r0
        L_0x0022:
            boolean r0 = r6 instanceof X.C122046Mo
            if (r0 != 0) goto L_0x0084
            boolean r0 = r6 instanceof X.C122086Ms
            if (r0 != 0) goto L_0x0084
            boolean r0 = r6 instanceof X.C122036Mn
            if (r0 == 0) goto L_0x0084
            r5 = r6
            X.6Mn r5 = (X.C122036Mn) r5
            X.BFF r0 = r5.A01
            android.graphics.drawable.Drawable r4 = r0.getCurrent()
            X.C18070vi.A0X(r4)
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0045
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r0 = r4.getBitmap()
            return r0
        L_0x0045:
            android.graphics.Bitmap r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x0082
            boolean r1 = r0.isRecycled()
        L_0x004e:
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x006d
        L_0x0054:
            int r0 = r4.getIntrinsicWidth()
            r2 = 1
            int r1 = java.lang.Math.max(r0, r2)
            int r0 = r4.getIntrinsicHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.graphics.Bitmap r0 = X.C108945cZ.A0H(r1, r0)
            r5.A00 = r0
            if (r0 == 0) goto L_0x007f
        L_0x006d:
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r0)
            r4.draw(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.setBounds(r3, r3, r1, r0)
        L_0x007f:
            android.graphics.Bitmap r0 = r5.A00
            return r0
        L_0x0082:
            r1 = 0
            goto L_0x004e
        L_0x0084:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70X.A08():android.graphics.Bitmap");
    }

    public View A09() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0a;
        }
        if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00;
        }
        if (this instanceof C122046Mo) {
            return ((C122046Mo) this).A00;
        }
        if (this instanceof C122086Ms) {
            return ((C122086Ms) this).A0B;
        }
        if (this instanceof C122036Mn) {
            return ((C122036Mn) this).A02;
        }
        return ((C122066Mq) this).A02;
    }

    public /* synthetic */ C121996Mj A0A() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0C;
        }
        return null;
    }

    public void A0B() {
        if (this instanceof C122076Mr) {
            C122076Mr r1 = (C122076Mr) this;
            C26378Cye cye = r1.A06;
            if (cye != null) {
                cye.A0B();
                r1.A0J = false;
            }
        } else if (this instanceof C122056Mp) {
            ((C122056Mp) this).A00.pause();
        } else if (this instanceof C122046Mo) {
            ((C122046Mo) this).A00.pause();
        } else if (this instanceof C122086Ms) {
            C122086Ms r2 = (C122086Ms) this;
            if (r2.A08) {
                Log.i("InlineYoutubeVideoPlayer/pause");
                r2.A0C.loadUrl("javascript:(function() { player.pauseVideo(); })()");
                r2.A02 = 2;
                r2.A00 = 2;
                C24149BwF bwF = r2.A0F;
                bwF.A08();
                bwF.A0J = true;
            }
        } else if (this instanceof C122036Mn) {
            ((C122036Mn) this).A01.stop();
        } else {
            C122066Mq r12 = (C122066Mq) this;
            C136026t9 r0 = r12.A00;
            if (r0 == null) {
                C18070vi.A11("staticContentPlayer");
                throw null;
            }
            r0.A02();
            r12.A01.removeMessages(0);
        }
    }

    public void A0C() {
        int i;
        int i2;
        if (this instanceof C122076Mr) {
            C122076Mr r1 = (C122076Mr) this;
            try {
                C135056ra r6 = r1.A09;
                if (r6 != null) {
                    r6.A00 = r1.A01;
                    int i3 = r1.A01;
                    if (r6 instanceof C122016Ml) {
                        C122016Ml r62 = (C122016Ml) r6;
                        if (r62.A02) {
                            AnonymousClass64H r3 = new AnonymousClass64H();
                            r3.A06 = r62.A0B;
                            r3.A05 = Integer.valueOf(r62.A01);
                            C136746uK r2 = r62.A0A;
                            r3.A0C = Long.valueOf(r2.A00 / 1000);
                            r3.A0B = Long.valueOf(r62.A09.A00);
                            long j = r62.A06;
                            long j2 = -1;
                            if (j != -1) {
                                j2 = (System.currentTimeMillis() - j) / 1000;
                            }
                            r3.A09 = Long.valueOf(j2);
                            r3.A0A = Long.valueOf(r62.A05);
                            r3.A02 = Double.valueOf((double) r62.A04);
                            r3.A0D = Long.valueOf(r62.A07);
                            r3.A08 = Long.valueOf(r62.A03);
                            r3.A07 = Long.valueOf(r62.A00);
                            r3.A03 = Integer.valueOf(r62.A00);
                            Integer num = r62.A01;
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = 1;
                            }
                            r3.A04 = Integer.valueOf(i2);
                            r3.A00 = AnonymousClass000.A0h();
                            r62.A08.CC7(r3);
                            r62.A02 = false;
                            r2.A01();
                            return;
                        }
                        return;
                    }
                    C122026Mm r63 = (C122026Mm) r6;
                    C136746uK r8 = r63.A0D;
                    r8.A00();
                    r63.A0C.A00();
                    C136746uK r7 = r63.A0B;
                    r7.A00();
                    C136746uK r5 = r63.A0A;
                    r5.A00();
                    r63.A03 = (long) i3;
                    AnonymousClass64J r4 = new AnonymousClass64J();
                    AnonymousClass70W r22 = r63.A04;
                    if (r22 != null) {
                        r4.A09 = Long.valueOf(r22.A04());
                        r4.A02 = Double.valueOf((double) r22.A05());
                        r4.A0A = C17880vN.A0o((long) r63.A04.A06, 1);
                    }
                    r4.A01 = Double.valueOf((double) r63.A02);
                    r4.A07 = Long.valueOf(r7.A00);
                    r4.A0D = Long.valueOf(r5.A00);
                    r4.A0C = C17880vN.A0n(r63.A01);
                    long j3 = r8.A00;
                    r4.A08 = Long.valueOf(j3);
                    int i4 = r63.A00;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            int i5 = 3;
                            if (i4 != 2) {
                                i5 = 4;
                                if (i4 != 3) {
                                    if (i4 == 5) {
                                        i5 = 6;
                                    }
                                }
                            }
                            i = Integer.valueOf(i5);
                        } else {
                            i = 2;
                        }
                        r4.A06 = i;
                        r4.A0B = Long.valueOf(r63.A03);
                        r4.A00 = Boolean.valueOf(AnonymousClass000.A1R((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
                        r4.A05 = Integer.valueOf(r63.A07);
                        AnonymousClass21W r52 = r63.A0E;
                        r4.A0E = C17880vN.A0n(r52.A0D);
                        r4.A03 = Double.valueOf((double) r52.A01);
                        r4.A04 = Integer.valueOf(r63.A09.A01(r52));
                        r63.A08.CC7(r4);
                    }
                    i = 1;
                    r4.A06 = i;
                    r4.A0B = Long.valueOf(r63.A03);
                    r4.A00 = Boolean.valueOf(AnonymousClass000.A1R((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
                    r4.A05 = Integer.valueOf(r63.A07);
                    AnonymousClass21W r522 = r63.A0E;
                    r4.A0E = C17880vN.A0n(r522.A0D);
                    r4.A03 = Double.valueOf((double) r522.A01);
                    r4.A04 = Integer.valueOf(r63.A09.A01(r522));
                    r63.A08.CC7(r4);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void A0D() {
        if (this instanceof C122076Mr) {
            C26378Cye cye = ((C122076Mr) this).A06;
            if (cye != null) {
                cye.A0D();
            }
        } else if (!(this instanceof C122056Mp) && (this instanceof C122046Mo)) {
        }
    }

    public void A0E() {
        if (this instanceof C122076Mr) {
            C122076Mr r2 = (C122076Mr) this;
            r2.A0J = true;
            if (r2.A06 != null) {
                AnonymousClass7RJ.A02(r2.A0Z, r2, 23);
                r2.A06.A0C();
                r2.A06.A0F(C108975cc.A00(r2.A0N ? 1 : 0));
                return;
            }
            r2.A0R = true;
            r2.A0G();
        } else if (this instanceof C122056Mp) {
            ((C122056Mp) this).A00.start();
        } else if (this instanceof C122046Mo) {
            ((C122046Mo) this).A00.start();
        } else if (this instanceof C122086Ms) {
            C122086Ms r4 = (C122086Ms) this;
            if (!r4.A07) {
                Log.i("InlineYoutubeVideoPlayer/start");
                r4.A07 = true;
                C21132Af0 af0 = r4.A05;
                if (af0 != null) {
                    C145917Nc r1 = new C145917Nc(r4, 29);
                    Executor executor = r4.A0E.A05;
                    af0.A0A(r1, executor);
                    af0.A00.A03(new C145917Nc(r4, 30), executor);
                    return;
                }
                C122086Ms.A00(r4);
                return;
            }
            r4.A0C.loadUrl("javascript:(function() { player.playVideo(); })()");
            r4.A02 = 1;
            r4.A00 = 1;
            C24149BwF bwF = r4.A0F;
            bwF.A0G();
            bwF.A0J = true;
        } else if (this instanceof C122036Mn) {
            ((C122036Mn) this).A01.start();
        } else {
            C122066Mq r42 = (C122066Mq) this;
            C136026t9 r0 = r42.A00;
            if (r0 == null) {
                C18070vi.A11("staticContentPlayer");
                throw null;
            }
            r0.A01();
            Handler handler = r42.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r42.A06() - r42.A05()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r2.A0D.A08 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x00b8
            r3 = r5
            X.6Mr r3 = (X.C122076Mr) r3
            r4 = 0
            r3.A0E = r4     // Catch:{ all -> 0x00b1 }
            r3.A0I = r4     // Catch:{ all -> 0x00b1 }
            r3.A0H = r4     // Catch:{ all -> 0x00b1 }
            r3.A0J = r4     // Catch:{ all -> 0x00b1 }
            X.Cye r2 = r3.A06     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00d7
            boolean r0 = r2.A0A     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x001f
            X.CwF r0 = r2.A0D     // Catch:{ all -> 0x00b1 }
            boolean r1 = r0.A08     // Catch:{ all -> 0x00b1 }
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r3.A0R = r0     // Catch:{ all -> 0x00b1 }
            r2.A0B()     // Catch:{ all -> 0x00b1 }
            r3.A0F = r4     // Catch:{ all -> 0x00b1 }
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.A02 = r0     // Catch:{ all -> 0x00b1 }
            X.Cye r0 = r3.A06     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.atomic.AtomicReference r1 = r0.A08     // Catch:{ all -> 0x00b1 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00b1 }
            X.D49 r0 = (X.D49) r0     // Catch:{ all -> 0x00b1 }
            boolean r0 = r0.A0T     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0057
            r0 = 1
            r3.A0F = r0     // Catch:{ all -> 0x00b1 }
            X.Cye r0 = r3.A06     // Catch:{ all -> 0x00b1 }
            long r0 = r0.A09()     // Catch:{ all -> 0x00b1 }
            r3.A02 = r0     // Catch:{ all -> 0x00b1 }
            X.Cye r0 = r3.A06     // Catch:{ all -> 0x00b1 }
            X.D49 r0 = X.C108965cb.A0E(r0)     // Catch:{ all -> 0x00b1 }
            int r0 = r0.A0W     // Catch:{ all -> 0x00b1 }
            r3.A00 = r0     // Catch:{ all -> 0x00b1 }
        L_0x0057:
            X.Cye r2 = r3.A06     // Catch:{ all -> 0x00b1 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "stop"
            X.C26378Cye.A06(r2, r0, r1)     // Catch:{ all -> 0x00b1 }
            android.os.Handler r1 = r2.A0C     // Catch:{ all -> 0x00b1 }
            r0 = 37
            android.os.Message r0 = r1.obtainMessage(r0)     // Catch:{ all -> 0x00b1 }
            r1.sendMessage(r0)     // Catch:{ all -> 0x00b1 }
            X.6Mw r1 = r3.A0a     // Catch:{ all -> 0x00b1 }
            X.C122126Mw.A01(r1)     // Catch:{ all -> 0x00b1 }
            r0 = 0
            X.C122126Mw.A00(r0, r1, r4)     // Catch:{ all -> 0x00b1 }
            X.Cye r0 = r3.A06     // Catch:{ all -> 0x00b1 }
            X.E9x r2 = r3.A0T     // Catch:{ all -> 0x00b1 }
            android.os.Handler r1 = r0.A0C     // Catch:{ all -> 0x00b1 }
            r0 = 45
            X.C108955ca.A1F(r1, r2, r0)     // Catch:{ all -> 0x00b1 }
            X.Cye r0 = r3.A06     // Catch:{ all -> 0x00b1 }
            r0.A0D()     // Catch:{ all -> 0x00b1 }
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x00b1 }
            r3.A0M = r4     // Catch:{ all -> 0x00b1 }
            r3.A0K = r4     // Catch:{ all -> 0x00b1 }
            X.1KB r1 = r3.A0X     // Catch:{ all -> 0x00b1 }
            r0 = 21
            X.AnonymousClass7RJ.A01(r1, r3, r0)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r3.A0C     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00d7
            X.11C r0 = r3.A05     // Catch:{ all -> 0x00b1 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x00b1 }
            android.media.AudioManager r2 = r0.A0D()     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00d7
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r3.A03     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00ad
            r0 = 3
            X.75N r1 = new X.75N     // Catch:{ all -> 0x00b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b1 }
            r3.A03 = r1     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r2.abandonAudioFocus(r1)     // Catch:{ all -> 0x00b1 }
            return
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "WaHeroPlayer/releasePlayer"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x00b8:
            boolean r0 = r5 instanceof X.C122056Mp
            if (r0 == 0) goto L_0x00d8
            r0 = r5
            X.6Mp r0 = (X.C122056Mp) r0
            X.6Mi r1 = r0.A00
            android.media.MediaPlayer r0 = r1.A09
            if (r0 == 0) goto L_0x00d7
            r0.reset()
            android.media.MediaPlayer r0 = r1.A09
            r0.release()
            r0 = 0
            r1.A09 = r0
            r0 = 0
            r1.A0H = r0
            r1.A00 = r0
            r1.A03 = r0
        L_0x00d7:
            return
        L_0x00d8:
            boolean r0 = r5 instanceof X.C122046Mo
            if (r0 == 0) goto L_0x00e5
            r0 = r5
            X.6Mo r0 = (X.C122046Mo) r0
            com.whatsapp.videoplayback.VideoSurfaceView r0 = r0.A00
            r0.A05()
            return
        L_0x00e5:
            boolean r0 = r5 instanceof X.C122086Ms
            if (r0 == 0) goto L_0x0127
            r2 = r5
            X.6Ms r2 = (X.C122086Ms) r2
            java.lang.String r0 = "InlineYoutubeVideoPlayer/stop"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.videoplayback.YoutubePlayerTouchOverlay r1 = r2.A0G
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x00fc
            r1.removeAllViews()
        L_0x00fc:
            android.webkit.WebView r1 = r2.A0C
            java.lang.String r0 = "YoutubeJsInterface"
            r1.removeJavascriptInterface(r0)
            r1.stopLoading()
            r1.destroy()
            r1 = 0
            r2.A01 = r1
            r0 = -1
            r2.A03 = r0
            r2.A00 = r1
            r0 = 1
            r2.A02 = r0
            r2.A08 = r1
            r2.A07 = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A04 = r0
            X.Af0 r0 = r2.A05
            if (r0 == 0) goto L_0x00d7
            r0.A0D()
            return
        L_0x0127:
            boolean r0 = r5 instanceof X.C122036Mn
            if (r0 == 0) goto L_0x0139
            r1 = r5
            X.6Mn r1 = (X.C122036Mn) r1
            X.DRK r0 = r1.A03
            r0.close()
            X.BFF r0 = r1.A01
            r0.stop()
            return
        L_0x0139:
            r1 = r5
            X.6Mq r1 = (X.C122066Mq) r1
            X.6t9 r0 = r1.A00
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = "staticContentPlayer"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0147:
            r0.A02()
            android.os.Handler r1 = r1.A01
            r0 = 0
            r1.removeMessages(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70X.A0F():void");
    }

    public /* synthetic */ void A0G() {
        if (this instanceof C122076Mr) {
            C122076Mr r4 = (C122076Mr) this;
            r4.hashCode();
            if (r4.A06 == null) {
                C121996Mj r2 = r4.A0C;
                if (r2 != null) {
                    Activity activity = r4.A02;
                    C17960vV.A07(activity);
                    if ((AnonymousClass3MZ.A0F(activity).getSystemUiVisibility() & 4) == 0) {
                        r2.A0F.setVisibility(0);
                        if (r2.A0A) {
                            r2.A0D.setVisibility(0);
                        }
                        C121996Mj.A01(r2);
                    } else {
                        r2.A06();
                    }
                }
                C122076Mr.A00(r4);
                r4.A0I = true;
                if (r4.A0R) {
                    if (r4.A06 != null) {
                        C121996Mj r22 = r4.A0C;
                        if (r22 != null) {
                            r22.A05 = null;
                            r22.A06 = new AnonymousClass7O3(r4, 0);
                        }
                        AnonymousClass7RJ.A00(r4.A0X, r4, 22);
                    }
                } else if (r4.A0C == null) {
                    C135056ra r0 = r4.A09;
                    if (r0 != null) {
                        r0.A00();
                    }
                    if (!r4.A0S) {
                        C26378Cye cye = r4.A06;
                        boolean z = r4.A0D;
                        Object[] A1a = AnonymousClass3MW.A1a();
                        Boolean valueOf = Boolean.valueOf(z);
                        A1a[0] = valueOf;
                        C26378Cye.A06(cye, "setLooping: %s", A1a);
                        C108955ca.A1F(cye.A0C, valueOf, 19);
                    }
                } else {
                    C26378Cye cye2 = r4.A06;
                    if (cye2 != null) {
                        cye2.A0B();
                    }
                    C121996Mj r23 = r4.A0C;
                    if (r23 != null) {
                        r23.A05 = new AnonymousClass7O2(r4);
                        r23.A06 = new AnonymousClass7O3(r4, 1);
                    }
                }
            }
        }
    }

    public /* synthetic */ void A0H() {
        C135056ra r1;
        if ((this instanceof C122076Mr) && (r1 = ((C122076Mr) this).A09) != null && !(r1 instanceof C122016Ml)) {
            C122026Mm r12 = (C122026Mm) r1;
            if (!r12.A06) {
                r12.A0B.A02();
            }
        }
    }

    public /* synthetic */ void A0I() {
        C135056ra r1;
        if ((this instanceof C122076Mr) && (r1 = ((C122076Mr) this).A09) != null) {
            if (r1 instanceof C122016Ml) {
                ((C122016Ml) r1).A0A.A00();
                return;
            }
            C122026Mm r12 = (C122026Mm) r1;
            r12.A0D.A00();
            r12.A0C.A00();
            r12.A0B.A00();
            r12.A0A.A00();
            r12.A00 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r3.A0S == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0J() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x006d
            r3 = r12
            X.6Mr r3 = (X.C122076Mr) r3
            X.Cye r0 = r3.A06
            if (r0 == 0) goto L_0x006d
            r3.A0L()
            X.Cye r1 = r3.A06
            X.CwF r0 = r1.A0D
            X.C26270CwF.A05(r0)
            android.os.Handler r1 = r1.A0C
            r0 = 50
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            r0 = 0
            r3.A0E = r0
            r3.A0E = r0
            r3.A0H = r0
            r3.A0P = r0
            r3.A0O = r0
            X.6ra r0 = r3.A09
            if (r0 == 0) goto L_0x0032
            r0.A00()
        L_0x0032:
            X.4Pw r4 = r3.A0B
            if (r4 == 0) goto L_0x0070
            X.0ve r2 = r3.A08
            r1 = 12285(0x2ffd, float:1.7215E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x006e
            boolean r10 = r4.A00()
        L_0x0046:
            r11 = 1
        L_0x0047:
            android.net.Uri r4 = r3.A04
            android.net.Uri r5 = r3.A03
            boolean r0 = r3.A0D
            r2 = 1
            if (r0 == 0) goto L_0x0055
            boolean r0 = r3.A0S
            r8 = 1
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r8 = 0
        L_0x0056:
            int r7 = r3.A00
            boolean r9 = r3.A0F
            java.lang.String r6 = r3.A0D
            X.CbZ r1 = X.C137696vs.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.E41 r0 = r3.A05
            if (r0 == 0) goto L_0x0066
            r1.A02 = r0
        L_0x0066:
            X.Cye r0 = r3.A06
            r0.A0I(r1)
            r3.A0I = r2
        L_0x006d:
            return
        L_0x006e:
            r10 = 0
            goto L_0x0046
        L_0x0070:
            r10 = 0
            r11 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70X.A0J():void");
    }

    public /* synthetic */ void A0K() {
        C26378Cye cye;
        if ((this instanceof C122076Mr) && (cye = ((C122076Mr) this).A06) != null) {
            cye.A0C();
        }
    }

    public /* synthetic */ void A0L() {
        if (this instanceof C122076Mr) {
            C122076Mr r2 = (C122076Mr) this;
            C26378Cye cye = r2.A06;
            if (cye == null || cye.A08() == 1) {
                r2.A0Q = false;
                return;
            }
            r2.A0Q = true;
            Handler handler = r2.A06.A0C;
            handler.sendMessage(handler.obtainMessage(49));
            return;
        }
        throw AnonymousClass04E.createAndThrow();
    }

    public void A0M(int i) {
        if (this instanceof C122076Mr) {
            C122076Mr r1 = (C122076Mr) this;
            C26378Cye cye = r1.A06;
            if (cye != null) {
                C109005cf.A0U(cye, Integer.valueOf(i), new Object[2], i);
                return;
            }
            r1.A04 = C17890vO.A0E(-1, i);
        } else if (this instanceof C122056Mp) {
            ((C122056Mp) this).A00.seekTo(i);
        } else if (this instanceof C122046Mo) {
            ((C122046Mo) this).A00.seekTo(i);
        } else if (this instanceof C122086Ms) {
            C122086Ms r4 = (C122086Ms) this;
            if (r4.A08) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("InlineYoutubeVideoPlayer/seekTo: ");
                int i2 = i / 1000;
                C17900vP.A0o(A10, i2);
                WebView webView = r4.A0C;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("javascript:(function() { player.seekTo(");
                A102.append(i2);
                webView.loadUrl(AnonymousClass000.A0y(", true); })()", A102));
                r4.A01 = i;
            }
        } else if (this instanceof C122036Mn) {
            throw new UnsupportedOperationException("not implemented yet");
        } else {
            C122066Mq r42 = (C122066Mq) this;
            C136026t9 r2 = r42.A00;
            if (r2 == null) {
                C18070vi.A11("staticContentPlayer");
                throw null;
            }
            r2.A01 = (long) i;
            r2.A02 = SystemClock.elapsedRealtime();
            Handler handler = r42.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r42.A06() - r42.A05()));
        }
    }

    public /* synthetic */ void A0O(int i) {
        if (this instanceof C122076Mr) {
            ((C122076Mr) this).A0a.setLayoutResizeMode(i);
        }
    }

    public /* synthetic */ void A0P(int i) {
        if (this instanceof C122076Mr) {
            this.A00 = i;
        }
    }

    public /* synthetic */ void A0Q(C133906ph r2) {
        if (this instanceof C122076Mr) {
            ((C122076Mr) this).A0a.A01 = r2;
        }
    }

    public /* synthetic */ void A0R(C135056ra r2, C142837Az r3) {
        if (this instanceof C122076Mr) {
            C122076Mr r0 = (C122076Mr) this;
            r0.A09 = r2;
            r0.A0f(r3);
            r0.A0J();
            return;
        }
        throw AnonymousClass04E.createAndThrow();
    }

    public /* synthetic */ void A0U(C121996Mj r5) {
        if (this instanceof C122076Mr) {
            C122076Mr r3 = (C122076Mr) this;
            if (!(r5 instanceof HeroPlaybackControlView)) {
                ViewGroup viewGroup = (ViewGroup) r5.getParent();
                int indexOfChild = viewGroup.indexOfChild(r5);
                if (indexOfChild > 0) {
                    viewGroup.removeViewAt(indexOfChild);
                }
                r5 = new HeroPlaybackControlView(r3.A0a.getContext(), (AttributeSet) null);
                viewGroup.addView(r5);
            }
            r3.A0C = r5;
            r3.A0a.A03(r5, false);
        }
    }

    public /* synthetic */ void A0V(File file) {
        if (this instanceof C122076Mr) {
            C122076Mr r1 = (C122076Mr) this;
            r1.A04 = Uri.fromFile(file);
            r1.A05 = null;
            return;
        }
        throw AnonymousClass04E.createAndThrow();
    }

    public void A0W(boolean z) {
        if (this instanceof C122076Mr) {
            C122076Mr r0 = (C122076Mr) this;
            r0.A0N = z;
            C26378Cye cye = r0.A06;
            if (cye != null) {
                cye.A0F(C108975cc.A00(z ? 1 : 0));
            }
        } else if (this instanceof C122056Mp) {
            ((C122056Mp) this).A00.setMute(z);
        } else if (this instanceof C122046Mo) {
            ((C122046Mo) this).A00.setMute(z);
        }
    }

    public boolean A0X() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0G;
        }
        throw AnonymousClass04E.createAndThrow();
    }

    public boolean A0Y() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0E;
        }
        throw AnonymousClass04E.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Z() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x0016
            r1 = r2
            X.6Mr r1 = (X.C122076Mr) r1
            boolean r0 = r1.A0Q
            if (r0 != 0) goto L_0x0014
            X.Cye r0 = r1.A06
            if (r0 == 0) goto L_0x0014
            boolean r1 = r1.A0K
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        L_0x0016:
            boolean r0 = r2 instanceof X.C122056Mp
            if (r0 == 0) goto L_0x0024
            r0 = r2
            X.6Mp r0 = (X.C122056Mp) r0
            X.6Mi r0 = r0.A00
            boolean r0 = r0.isAvailable()
            return r0
        L_0x0024:
            boolean r0 = r2 instanceof X.C122046Mo
            if (r0 != 0) goto L_0x0014
            boolean r0 = r2 instanceof X.C122086Ms
            if (r0 != 0) goto L_0x0014
            boolean r0 = r2 instanceof X.C122036Mn
            if (r0 == 0) goto L_0x0014
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70X.A0Z():boolean");
    }

    public boolean A0a() {
        if (this instanceof C122076Mr) {
            C122076Mr r3 = (C122076Mr) this;
            C26378Cye cye = r3.A06;
            if (cye == null || r3.A0Q) {
                return false;
            }
            if (r3.A0J || cye.A0J()) {
                return true;
            }
            return false;
        } else if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00.isPlaying();
        } else {
            if (this instanceof C122046Mo) {
                return ((C122046Mo) this).A00.isPlaying();
            }
            if (this instanceof C122086Ms) {
                return C17890vO.A1R(((C122086Ms) this).A02);
            }
            if (this instanceof C122036Mn) {
                return ((C122036Mn) this).A01.isRunning();
            }
            C136026t9 r0 = ((C122066Mq) this).A00;
            if (r0 != null) {
                return r0.A03;
            }
            C18070vi.A11("staticContentPlayer");
            throw null;
        }
    }

    public boolean A0b() {
        if (this instanceof C122076Mr) {
            C122076Mr r1 = (C122076Mr) this;
            if (!r1.A0E || !r1.A0H || !r1.A0M) {
                return false;
            }
            return true;
        } else if (this instanceof C122056Mp) {
            return ((C122056Mp) this).A00.A0H;
        } else {
            if (this instanceof C122046Mo) {
                return C108975cc.A1D(((C122046Mo) this).A00.getCurrentPosition(), 50);
            }
            if (!(this instanceof C122086Ms)) {
                if (!(this instanceof C122036Mn)) {
                    return true;
                }
                throw new UnsupportedOperationException("not implemented yet");
            }
        }
        return false;
    }

    public boolean A0c() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0L;
        }
        if (this instanceof C122056Mp) {
            return false;
        }
        boolean z = this instanceof C122046Mo;
        return false;
    }

    public /* synthetic */ boolean A0d() {
        if (this instanceof C122076Mr) {
            return C108995ce.A1U(((C122076Mr) this).A0a.A07);
        }
        return false;
    }

    public /* synthetic */ boolean A0e() {
        if (this instanceof C122076Mr) {
            return ((C122076Mr) this).A0I;
        }
        return false;
    }

    public void A0S(AnonymousClass88O r1) {
        this.A07 = r1;
    }

    public void A0T(AnonymousClass88S r1) {
        this.A0B = r1;
    }
}
