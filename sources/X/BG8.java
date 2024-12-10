package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class BG8 extends Handler implements Runnable {
    public int A00;
    public IOException A01;
    public C28569E8a A02;
    public CJ6 A03;
    public final int A04;
    public final long A05;
    public final E7O A06;
    public volatile Thread A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public final /* synthetic */ C25667Cjx A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BG8(Looper looper, C28569E8a e8a, E7O e7o, C25667Cjx cjx, int i, long j) {
        super(looper);
        this.A0A = cjx;
        this.A06 = e7o;
        this.A02 = e8a;
        this.A04 = i;
        this.A05 = j;
    }

    public void A00(boolean z) {
        this.A09 = z;
        this.A01 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.A08 = true;
            this.A06.BET();
            Thread thread = this.A07;
            if (thread != null) {
                thread.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.A0A.A00 = null;
        SystemClock.elapsedRealtime();
        C28569E8a e8a = this.A02;
        C26056CrS.A01(e8a);
        e8a.Bwq(this.A06, true);
        this.A02 = null;
    }

    public void handleMessage(Message message) {
        int i;
        if (!this.A09) {
            int i2 = message.what;
            if (i2 == 0) {
                this.A01 = null;
                C25667Cjx cjx = this.A0A;
                ExecutorService executorService = cjx.A02;
                BG8 bg8 = cjx.A00;
                C26056CrS.A01(bg8);
                executorService.execute(bg8);
            } else if (i2 != 4) {
                C25667Cjx cjx2 = this.A0A;
                cjx2.A00 = null;
                SystemClock.elapsedRealtime();
                C28569E8a e8a = this.A02;
                C26056CrS.A01(e8a);
                if (this.A08 || (i = message.what) == 1) {
                    e8a.Bwq(this.A06, false);
                } else if (i == 2) {
                    try {
                        e8a.Bws(this.A06);
                    } catch (RuntimeException e) {
                        Log.e("LoadTask", "Unexpected exception handling load completed", e);
                        cjx2.A01 = new C24187Bwx(e);
                    }
                } else if (i == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.A01 = iOException;
                    this.A00++;
                    CJ6 Bww = e8a.Bww(this.A06, iOException);
                    this.A03 = Bww;
                    int i3 = Bww.A00;
                    if (i3 == 3) {
                        cjx2.A01 = this.A01;
                    } else if (i3 != 2) {
                        if (i3 == 1) {
                            this.A00 = 1;
                        }
                        long min = (long) ((int) Math.min(C17890vO.A03(this.A00 - 1) + 500, 5000));
                        C26056CrS.A03(AnonymousClass000.A1X(cjx2.A00));
                        cjx2.A00 = this;
                        if (min > 0) {
                            sendEmptyMessageDelayed(0, min);
                            return;
                        }
                        this.A01 = null;
                        cjx2.A02.execute(this);
                    }
                }
            } else {
                throw ((Throwable) message.obj);
            }
        }
    }

    public void run() {
        try {
            this.A07 = Thread.currentThread();
            if (!this.A08) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("load:<cls>");
                E7O e7o = this.A06;
                C17900vP.A0a(e7o, A10);
                C25304Cd8.A01(AnonymousClass000.A0y("</cls>", A10));
                e7o.Bhb();
                C25304Cd8.A00();
            }
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.A09) {
                BE7.A18(this, e, 3);
            }
        } catch (InterruptedException unused) {
            C26056CrS.A03(this.A08);
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.A09) {
                BE7.A18(this, new C24187Bwx(e2), 3);
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.A09) {
                BE7.A18(this, new C24187Bwx(e3), 3);
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.A09) {
                BE7.A18(this, e4, 4);
            }
            throw e4;
        } catch (Throwable th) {
            C25304Cd8.A00();
            throw th;
        }
    }
}
