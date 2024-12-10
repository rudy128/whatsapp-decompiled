package X;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.DKd  reason: case insensitive filesystem */
public final class C26948DKd implements OnCompleteListener {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C25121CYu A03;
    public final C26377Cyd A04;

    public C26948DKd(C25121CYu cYu, C26377Cyd cyd, int i, long j, long j2) {
        this.A04 = cyd;
        this.A00 = i;
        this.A03 = cYu;
        this.A01 = j;
        this.A02 = j2;
    }

    public static C23090Bb5 A00(C26910DIr dIr, C26157CtR ctR, int i) {
        C23090Bb5 bb5;
        C23082Bax bax = ctR.A0Q;
        if (bax == null) {
            bb5 = null;
        } else {
            bb5 = bax.A02;
        }
        if (bb5 != null && bb5.A02) {
            int[] iArr = bb5.A04;
            if (iArr != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < iArr.length) {
                        if (iArr[i2] == i) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                int[] iArr2 = bb5.A05;
                if (iArr2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < iArr2.length) {
                            if (iArr2[i3] == i) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (dIr.A00 < bb5.A00) {
                return bb5;
            }
        }
        return null;
    }

    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        C26377Cyd cyd = this.A04;
        if (cyd.A08()) {
            C23087Bb2 bb2 = C25942Cp8.A00().A00;
            if (bb2 == null || bb2.A03) {
                C26910DIr dIr = (C26910DIr) cyd.A09.get(this.A03);
                if (dIr != null) {
                    EDS eds = dIr.A04;
                    if (eds instanceof C26157CtR) {
                        C26157CtR ctR = (C26157CtR) eds;
                        long j2 = this.A01;
                        boolean z = true;
                        long j3 = 0;
                        boolean A1R = AnonymousClass000.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                        int i7 = ctR.A0E;
                        if (bb2 != null) {
                            A1R &= bb2.A04;
                            i2 = bb2.A01;
                            i3 = bb2.A02;
                            i = bb2.A00;
                            if (ctR.A0Q != null && !ctR.BeN()) {
                                C23090Bb5 A002 = A00(dIr, ctR, this.A00);
                                if (A002 != null) {
                                    if (!A002.A03 || j2 <= 0) {
                                        z = false;
                                    }
                                    i3 = A002.A00;
                                    A1R = z;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        if (task.isSuccessful()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (((zzw) task).zzd) {
                                i4 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof ApiException) {
                                    Status status = ((ApiException) exception).mStatus;
                                    i4 = status.A00;
                                    C23203Bcx bcx = status.A02;
                                    if (bcx != null) {
                                        i5 = bcx.A01;
                                    }
                                } else {
                                    i4 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (A1R) {
                            j3 = j2;
                            long j4 = this.A02;
                            j = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - j4);
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        C108955ca.A1F(cyd.A06, new CRZ(new C23098BbD((String) null, (String) null, this.A00, i4, i5, i7, i6, j3, j), i, i3, (long) i2), 18);
                    }
                }
            }
        }
    }
}
