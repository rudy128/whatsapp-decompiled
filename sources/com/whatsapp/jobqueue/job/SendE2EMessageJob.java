package com.whatsapp.jobqueue.job;

import X.A8R;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass121;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1KB;
import X.AnonymousClass1MB;
import X.AnonymousClass1MS;
import X.AnonymousClass1MZ;
import X.AnonymousClass1O2;
import X.AnonymousClass1OZ;
import X.AnonymousClass1P1;
import X.AnonymousClass1P3;
import X.AnonymousClass1PT;
import X.AnonymousClass1RP;
import X.AnonymousClass1U5;
import X.AnonymousClass1UD;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass207;
import X.AnonymousClass2RL;
import X.AnonymousClass2RT;
import X.AnonymousClass3EB;
import X.AnonymousClass3EF;
import X.AnonymousClass3KP;
import X.C000100c;
import X.C000200d;
import X.C146507Pj;
import X.C164848aA;
import X.C166408cq;
import X.C166418cr;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C190809lY;
import X.C192419oM;
import X.C194589ry;
import X.C19880zA;
import X.C19890zB;
import X.C22488B9u;
import X.C22931Dv;
import X.C22941Dw;
import X.C22971Dz;
import X.C24681Lg;
import X.C24751Ln;
import X.C25281Np;
import X.C25931Qe;
import X.C26011Qm;
import X.C26111Qw;
import X.C27131Uv;
import X.C29641cc;
import X.C31851gE;
import X.C32011gU;
import X.C32331h1;
import X.C32501hI;
import X.C32541hM;
import X.C32691hb;
import X.C32981i4;
import X.C35551mQ;
import X.C50242Tr;
import X.C52122aP;
import X.C54592eO;
import X.C56912iE;
import X.C57252im;
import X.C57282ip;
import X.C57612jM;
import X.C58002jz;
import X.C58302kT;
import X.C58642l1;
import X.C59392mE;
import X.C62162qt;
import X.C63172sd;
import X.C63182se;
import X.C63672tV;
import X.C63962tz;
import X.C64002u3;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.exception.OutOfMemoryException;
import com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class SendE2EMessageJob extends Job implements C22488B9u {
    public static final ConcurrentHashMap A1A = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient int A01;
    public transient long A02;
    public transient long A03;
    public transient long A04;
    public transient C19880zA A05;
    public transient C19880zA A06;
    public transient C19880zA A07;
    public transient C19880zA A08;
    public transient C19880zA A09;
    public transient AnonymousClass190 A0A;
    public transient AnonymousClass1KB A0B;
    public transient AnonymousClass11S A0C;
    public transient AnonymousClass11P A0D;
    public transient AnonymousClass1P1 A0E;
    public transient AnonymousClass1P3 A0F;
    public transient C192419oM A0G;
    public transient AnonymousClass1CJ A0H;
    public transient AnonymousClass121 A0I;
    public transient C32691hb A0J;
    public transient AnonymousClass1MS A0K;
    public transient AnonymousClass1MZ A0L;
    public transient AnonymousClass1RP A0M;
    public transient C24681Lg A0N;
    public transient C26111Qw A0O;
    public transient AnonymousClass1U5 A0P;
    public transient C52122aP A0Q;
    public transient C18030ve A0R;
    public transient AnonymousClass207 A0S;
    public transient C25931Qe A0T;
    public transient C57252im A0U;
    public transient DeviceJid A0V;
    public transient Jid A0W;
    public transient UserJid A0X;
    public transient A8R A0Y;
    public transient C58002jz A0Z;
    public transient C63182se A0a;
    public transient C32011gU A0b;
    public transient C56912iE A0c;
    public transient C63172sd A0d;
    public transient C58302kT A0e;
    public transient AnonymousClass1O2 A0f;
    public transient AnonymousClass1OZ A0g;
    public transient C57282ip A0h;
    public transient AnonymousClass1PT A0i;
    public transient C166418cr A0j;
    public transient C194589ry A0k;
    public transient AnonymousClass206 A0l;
    public transient C190809lY A0m;
    public transient AnonymousClass1W6 A0n;
    public transient C54592eO A0o;
    public transient C57612jM A0p;
    public transient AnonymousClass00H A0q;
    public transient boolean A0r;
    public transient boolean A0s;
    public transient boolean A0t;
    public transient boolean A0u;
    public transient long A0v;
    public transient C19880zA A0w;
    public transient C32501hI A0x;
    public transient C32541hM A0y;
    public transient AnonymousClass1UD A0z;
    public transient C26011Qm A10;
    public transient C32331h1 A11;
    public transient C24751Ln A12;
    public transient AnonymousClass1MB A13;
    public transient C27131Uv A14;
    public transient C59392mE A15;
    public transient C29641cc A16;
    public transient C35551mQ A17;
    public transient JniBridge A18;
    public transient boolean A19;
    public final String botInvokeRawJid;
    public final String broadcastListName;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final boolean forceSenderKeyDistribution;
    public final String groupParticipantHash;
    public final String groupParticipantUserHash;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final boolean isRetryReceiptLid;
    public final String jid;
    public final Integer liveLocationDuration;
    public final long messageSendStartTime;
    public final int messageType;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final long originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useLidForEncryption;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final boolean useParticipantUserHash;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r5.editVersion != 8) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass205 A00() {
        /*
            r5 = this;
            com.whatsapp.jid.UserJid r0 = r5.A0X
            if (r0 == 0) goto L_0x0032
            X.1BI r4 = X.C22971Dz.A00(r0)
        L_0x0008:
            r2 = 1
        L_0x0009:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C22971Dz.A0M(r4)
            if (r0 == 0) goto L_0x0027
            X.0ve r2 = r5.A0R
            r1 = 11965(0x2ebd, float:1.6767E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0027
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r4)
            com.whatsapp.jid.UserJid r4 = X.C22971Dz.A03(r0)
        L_0x0027:
            boolean r1 = r3.booleanValue()
            java.lang.String r0 = r5.id
            X.205 r0 = X.AnonymousClass205.A01(r4, r0, r1)
            return r0
        L_0x0032:
            com.whatsapp.jid.Jid r0 = r5.A0W
            X.1BI r4 = X.C22971Dz.A00(r0)
            int r1 = r5.editVersion
            r0 = 8
            r2 = 0
            if (r1 == r0) goto L_0x0009
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A00():X.205");
    }

    private String A01() {
        String A092;
        String A072 = C22971Dz.A07(this.jid);
        String A073 = C22971Dz.A07(this.participant);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; id=");
        A102.append(this.id);
        A102.append("; jid=");
        A102.append(A072);
        A102.append("; participant=");
        A102.append(A073);
        A102.append("; retryCount=");
        A102.append(this.retryCount);
        A102.append("; targetDevices=");
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null) {
            A092 = "null";
        } else {
            A092 = C22971Dz.A09((String[]) hashSet.toArray(new String[0]));
        }
        A102.append(A092);
        A102.append("; groupParticipantHash=");
        A102.append(this.groupParticipantHash);
        A102.append("; includeSenderKeysInMessage=");
        A102.append(this.includeSenderKeysInMessage);
        A102.append("; useOneOneEncryptionOnPHashMismatch=");
        A102.append(this.useOneOneEncryptionOnPHashMismatch);
        A102.append("; forceSenderKeyDistribution=");
        A102.append(this.forceSenderKeyDistribution);
        A102.append("; useParticipantUserHash=");
        A102.append(this.useParticipantUserHash);
        C17900vP.A0q(A102, this);
        return A102.toString();
    }

    private void A02(int i, int i2, int i3) {
        if (this.A0l != null) {
            Set A002 = this.A0Z.A00();
            AnonymousClass1PT r2 = this.A0i;
            C62162qt r1 = new C62162qt(this.A0l);
            r1.A04 = i;
            r1.A03 = this.A0l.A1H;
            r1.A02 = this.A0l.A0A;
            r1.A00 = A002.size();
            r1.A0B = !A06();
            r1.A0A = A06();
            r1.A0C = this.A0u;
            r1.A01 = i3;
            r1.A08 = Integer.valueOf(i2);
            C62162qt.A00(r1, r2, A002);
            this.A11.A01((AnonymousClass3KP) null, this.A0l.A0v, 20);
        }
    }

    private void A03(int i, boolean z, int i2) {
        if (this.A0l != null) {
            Set A002 = this.A0Z.A00();
            AnonymousClass1PT r2 = this.A0i;
            C62162qt r1 = new C62162qt(this.A0l);
            r1.A04 = i;
            r1.A03 = i2;
            r1.A02 = this.A0l.A0A;
            r1.A00 = A002.size();
            r1.A0B = z;
            r1.A0A = A06();
            r1.A0C = this.A0u;
            C62162qt.A00(r1, r2, A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r8 != null) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(com.whatsapp.jid.DeviceJid r8, com.whatsapp.jid.Jid r9) {
        /*
            r7 = this;
            boolean r3 = r9 instanceof X.AnonymousClass1E9
            if (r3 == 0) goto L_0x0007
            r2 = 1
            if (r8 == 0) goto L_0x0027
        L_0x0007:
            r2 = 0
            if (r8 == 0) goto L_0x0027
            r6 = 0
            if (r3 != 0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "participant cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r0 = r7.retryCount
            if (r0 < 0) goto L_0x023c
            java.lang.String r0 = r7.groupParticipantHash
            if (r0 == 0) goto L_0x0050
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupParticipantHash cannot be set to an empty string"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0050:
            java.lang.String r1 = r7.groupParticipantHash
            if (r1 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x0072
            if (r8 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupParticipantHash cannot be set if participant is set"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupParticipantHash cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            boolean r0 = r7.includeSenderKeysInMessage
            if (r0 == 0) goto L_0x00ac
            if (r3 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "includeSenderKeysInMessage cannot be set if the primary jid is not a group or broadcast list"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            if (r2 == 0) goto L_0x00dc
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r7.A05()
            if (r0 != 0) goto L_0x00dc
            int r0 = r7.messageType
            boolean r0 = X.C63792th.A03(r9, r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "cannot send e2e message to a group without a participant hash"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00dc:
            long r1 = r7.expireTimeMs
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "expireTimeMs must be non-negative"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            if (r3 != 0) goto L_0x013c
            com.whatsapp.jid.DeviceJid r0 = r7.A0V     // Catch:{ IllegalArgumentException -> 0x0122 }
            if (r0 == 0) goto L_0x0108
            X.C63962tz.A02(r0)     // Catch:{ IllegalArgumentException -> 0x0122 }
            goto L_0x013c
        L_0x0108:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0122 }
            java.lang.String r0 = "jid is not a valid axolotl address"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0122 }
            java.lang.String r0 = r7.A01()     // Catch:{ IllegalArgumentException -> 0x0122 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0122 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0122 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0122 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0122 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0122 }
        L_0x0122:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "jid is not a valid axolotl address"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x013c:
            if (r6 != 0) goto L_0x015c
            X.C63962tz.A02(r8)     // Catch:{ IllegalArgumentException -> 0x0142 }
            goto L_0x015c
        L_0x0142:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "participant is not a valid axolotl address"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x015c:
            boolean r0 = X.C22971Dz.A0O(r9)
            byte[] r1 = r7.ephemeralSharedSecret
            if (r0 != 0) goto L_0x01bc
            if (r1 != 0) goto L_0x01a2
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r0 != 0) goto L_0x0188
            java.lang.String r0 = r7.broadcastListName
            if (r0 == 0) goto L_0x01c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "broadcastListName should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0188:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "broadcastParticipantEphemeralSettings should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ephemeralSharedSecret should only be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01bc:
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r1 != 0) goto L_0x01e2
            if (r0 != 0) goto L_0x0222
        L_0x01c2:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x020b
            if (r3 != 0) goto L_0x01e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01e2:
            if (r0 != 0) goto L_0x01c2
            int r0 = r7.retryCount
            if (r0 == 0) goto L_0x0222
            goto L_0x01c2
        L_0x01e9:
            X.8cr r0 = r7.A0j
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 != 0) goto L_0x020b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "missing sender key distribution message "
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x020b:
            X.2l1 r2 = X.C58642l1.A00(r7)
            java.util.concurrent.ConcurrentHashMap r1 = A1A
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x021f }
            r7.duplicate = r0     // Catch:{ all -> 0x021f }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x021f }
            r1.put(r2, r0)     // Catch:{ all -> 0x021f }
            monitor-exit(r1)     // Catch:{ all -> 0x021f }
            return
        L_0x021f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021f }
            throw r0
        L_0x0222:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "both or neither ephemeral parameter should be set for a broadcast list jid"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x023c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "retryCount cannot be negative"
            r1.append(r0)
            java.lang.String r0 = r7.A01()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A04(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid):void");
    }

    private boolean A05() {
        HashSet hashSet = this.targetDeviceRawJids;
        if (hashSet == null || hashSet.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean A06() {
        int i = this.messageType;
        if (i == 58 || i == 69 || i == 77 || !A05()) {
            return false;
        }
        return true;
    }

    public boolean A0B() {
        if (!AnonymousClass000.A1Q((AnonymousClass11P.A01(this.A0D) > this.expireTimeMs ? 1 : (AnonymousClass11P.A01(this.A0D) == this.expireTimeMs ? 0 : -1)))) {
            for (Requirement requirement : this.parameters.requirements) {
                if ((this.A0k == null || (!(requirement instanceof AxolotlSessionRequirement) && !(requirement instanceof AnonymousClass3EF) && !(requirement instanceof AxolotlMultiDeviceSessionRequirement))) && !requirement.Bfv()) {
                    if (!(requirement instanceof AnonymousClass3EB)) {
                        return false;
                    }
                    this.A0u = true;
                    return false;
                } else if (!this.A0r && !this.A19) {
                    if ((requirement instanceof AxolotlSessionRequirement) || (requirement instanceof AnonymousClass3EF) || (requirement instanceof AxolotlMultiDeviceSessionRequirement)) {
                        this.A19 = true;
                        AnonymousClass11P r2 = this.A0D;
                        this.A03 = SystemClock.uptimeMillis();
                        this.A02 = AnonymousClass11P.A01(r2);
                    }
                }
            }
        }
        return true;
    }

    public void A0D(AnonymousClass206 r27, Collection collection, int i, int i2, int i3, int i4, boolean z) {
        long j;
        AnonymousClass206 r6 = r27;
        if (r27 != null) {
            if (this.messageSendStartTime != 0 && this.A0v != 0) {
                AnonymousClass11P r0 = this.A0D;
                long uptimeMillis = SystemClock.uptimeMillis();
                long A012 = AnonymousClass11P.A01(r0) - this.messageSendStartTime;
                int i5 = i;
                if (i5 == 6) {
                    j = this.A0v;
                } else {
                    j = r6.A12;
                }
                AnonymousClass1PT r5 = this.A0i;
                int i6 = this.retryCount;
                boolean z2 = this.A0u;
                boolean z3 = this.A0s;
                int i7 = this.A00;
                Collection collection2 = collection;
                int i8 = i2;
                int i9 = i3;
                int i10 = i4;
                r5.A0G(r6, (Integer) null, collection2, i5, i8, i6, i7, i10, i9, uptimeMillis - j, A012, A012, z2, z3, this.A0r, A06(), z);
                if (i5 == 3) {
                    AnonymousClass205 r1 = r6.A0v;
                    if (C22971Dz.A0a(r1.A00) && r1.A02) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("SendE2EMessageJob/sentStatusMessage msg=");
                        A102.append(r6);
                        A102.append(" statusDistributionInfo: ");
                        C17900vP.A0b(C63672tV.A00(r6), A102);
                    }
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0j = C166418cr.A01((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("SendE2EMessageJob/e2e missing message bytes ");
            C17890vO.A19(A102, A01());
        }
        if (this.A0j == null) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("message must not be null");
            throw C17900vP.A06(A01(), A103);
        } else if (this.id != null) {
            Jid A022 = Jid.Companion.A02(this.jid);
            this.A0W = A022;
            if (A022 != null) {
                this.A0V = DeviceJid.Companion.A06(this.jid);
                this.A0X = C22941Dw.A02(this.recipientRawJid);
                DeviceJid A062 = DeviceJid.Companion.A06(this.participant);
                this.A0r = true;
                this.A0v = SystemClock.uptimeMillis();
                A04(A062, this.A0W);
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append("SendE2EMessageJob/readObject done: ");
                C17890vO.A1A(A104, A01());
                return;
            }
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("jid must not be null");
            throw C17900vP.A06(A01(), A105);
        } else {
            StringBuilder A106 = AnonymousClass000.A10();
            A106.append("id must not be null");
            throw C17900vP.A06(A01(), A106);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0j.A0M());
    }

    public void A08() {
        int i;
        Collection collection;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("SendE2EMessageJob/e2e message send job added");
        C17890vO.A1A(A102, A01());
        if (this.duplicate) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("SendE2EMessageJob/e2e messasge job is duplicate, skipping requirement check");
            C17890vO.A1B(A103, A01());
            return;
        }
        if (A05()) {
            i = 11;
        } else {
            i = 1;
            if (this.retryCount > 0) {
                i = 12;
            }
        }
        this.A19 = true;
        DeviceJid deviceJid = null;
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.Bfv()) {
                    deviceJid = axolotlSessionRequirement.A00;
                }
            } else if (requirement instanceof AnonymousClass3EF) {
                AnonymousClass3EF r5 = (AnonymousClass3EF) requirement;
                if (!r5.Bfv()) {
                    deviceJid = r5.A00;
                }
            } else if (requirement instanceof AxolotlMultiDeviceSessionRequirement) {
                AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement = (AxolotlMultiDeviceSessionRequirement) requirement;
                List<List> A002 = AxolotlMultiDeviceSessionRequirement.A00(axolotlMultiDeviceSessionRequirement);
                if (A002 == null) {
                    collection = Collections.emptySet();
                } else {
                    ArrayList A132 = AnonymousClass000.A13();
                    for (List A0M2 : A002) {
                        A132.addAll(C63962tz.A05(axolotlMultiDeviceSessionRequirement.A01.A0M(A0M2)));
                    }
                    collection = A132;
                }
                if (!collection.isEmpty()) {
                    C17900vP.A0Y(collection, "SendE2EMessageJob/ missing md sessions, fetching prekeys: ", AnonymousClass000.A10());
                    DeviceJid[] deviceJidArr = (DeviceJid[]) collection.toArray(new DeviceJid[0]);
                    this.A0s = true;
                    this.A19 = false;
                    this.A04 = SystemClock.uptimeMillis();
                    int size = collection.size();
                    this.A00 = size;
                    C32501hI r9 = this.A0x;
                    boolean z = axolotlMultiDeviceSessionRequirement instanceof AxolotlMultiDeviceSenderKeyRequirement;
                    Jid jid2 = axolotlMultiDeviceSessionRequirement.A04;
                    if (z) {
                        C22931Dv r0 = AnonymousClass1BI.A00;
                        jid2 = C50242Tr.A00(jid2);
                        C17960vV.A07(jid2);
                    }
                    r9.A03(deviceJidArr, i, C64002u3.A04(jid2), C64002u3.A00(size), false);
                }
            } else if (requirement instanceof AxolotlFastRatchetSenderKeyRequirement) {
                if (!((AxolotlFastRatchetSenderKeyRequirement) requirement).Bfv()) {
                    this.A14.A0c();
                }
            } else if (!(requirement instanceof AnonymousClass3EB)) {
                C19880zA r1 = this.A0w;
                if (r1.A07()) {
                    r1.A03();
                    throw AnonymousClass000.A0s("isValidVNameRequirementNotFulfilled");
                }
            } else if (!((AnonymousClass3EB) requirement).Bfv()) {
                this.A0u = true;
                if (this.retryCount == 0) {
                    C29641cc r52 = this.A16;
                    Log.i("Scheduling job for unsent messages");
                    AnonymousClass11C r12 = r52.A00;
                    JobScheduler jobScheduler = r12.A01;
                    if (jobScheduler == null) {
                        jobScheduler = (JobScheduler) AnonymousClass11C.A03(r12, "jobscheduler", true);
                        r12.A01 = jobScheduler;
                    }
                    jobScheduler.schedule(new JobInfo.Builder(6, new ComponentName(r52.A01.A00, UnsentMessagesNetworkAvailableJob.class)).setRequiredNetworkType(1).setPersisted(true).build());
                }
            }
        }
        if (deviceJid != null) {
            C17900vP.A0Y(deviceJid, "SendE2EMessageJob/ missing device session, fetching prekeys: ", AnonymousClass000.A10());
            this.A0s = true;
            this.A19 = false;
            this.A04 = SystemClock.uptimeMillis();
            this.A0x.A03(new DeviceJid[]{deviceJid}, i, C64002u3.A04(deviceJid), 0, false);
        }
        this.A0x.A00();
        if (this.A0s) {
            AnonymousClass1PT r13 = this.A0i;
            int hashCode = this.id.hashCode();
            int i2 = this.messageType;
            if (r13.A0b) {
                r13.A0G.A04(hashCode, 8, -1, i2);
            }
        }
    }

    public void A09() {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("SendE2EMessageJob/e2e send job canceled");
        C17890vO.A1B(A102, A01());
        A1A.remove(C58642l1.A00(this));
        this.A0f.A04(this.A0V, A00());
        C166418cr r1 = this.A0j;
        if ((r1.bitField1_ & 256) != 0) {
            C164848aA r0 = r1.keepInChatMessage_;
            if (r0 != null || (r0 = C164848aA.DEFAULT_INSTANCE) != null) {
                C166408cq r02 = r0.key_;
                if (r02 == null) {
                    r02 = C166408cq.DEFAULT_INSTANCE;
                }
                AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(r02.remoteJid_);
                if (A022 != null) {
                    this.A0f.A04(this.A0V, AnonymousClass205.A01(A022, this.id, true));
                    this.A0B.A0J(new C146507Pj(this, A022, 34));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04c7, code lost:
        if ((!r3.A0X(r11)) != false) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05e9, code lost:
        if (r7 != null) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06ad, code lost:
        if (r10 > X.C18020vd.A00(X.C18040vf.A02, r0.A0R, 3168)) goto L_0x06af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0712, code lost:
        if (r7 != null) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        if ((r3.bitField0_ & 2) != 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0aff, code lost:
        if (X.C18020vd.A00(r5, r7, 7820) != 0) goto L_0x0b80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0cee, code lost:
        if (r0.includeSenderKeysInMessage == false) goto L_0x0cf0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f3 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f4 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0257 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x026a A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0289 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0404 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x041d A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x044b A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x049e A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04cd A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05e7 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0624 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x062c A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0636 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0683 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06ab A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x077f A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x07b1 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07b7 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x085b A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x085f A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0864 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0880 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x089c A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x08b5 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x08bb A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x08c2 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x08cb A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x08d4 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x08db A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x08e4 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x08ef A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0916 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0930 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0953 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x095b A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0a18 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0a20 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0a49 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0a4b A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0a4e A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0a63 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0a85 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0aab A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0ad5 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0b0a A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0c40 A[Catch:{ Exception -> 0x0c47, all -> 0x0c3b, OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0174 A[Catch:{ RuntimeException -> 0x0cf7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r63 = this;
            long r22 = android.os.SystemClock.uptimeMillis()
            r0 = r63
            long r2 = r0.A0v
            r16 = 0
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            r1 = r22
            r0.A0v = r1
        L_0x0012:
            java.lang.String r2 = r0.A01()
            boolean r1 = r0.duplicate
            if (r1 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SendE2EMessageJob/e2e message job is duplicate skipping"
            X.C17900vP.A0g(r0, r2, r1)
            return
        L_0x0024:
            com.whatsapp.jid.Jid r1 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1BI r1 = X.C22971Dz.A00(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C17960vV.A07(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C22971Dz.A0V(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x003d
            X.190 r5 = r0.A0A     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r4 = "cant use sende2emessagejob for this jid"
            r3 = 0
            r1 = 0
            r5.A0G(r4, r3, r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            return
        L_0x003d:
            X.205 r9 = r0.A00()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r4 = r0.participant     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1E0 r3 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.DeviceJid r7 = r3.A06(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = r0.participant     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0c7e
            com.whatsapp.jid.DeviceJid r5 = r0.A0V     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0053:
            com.whatsapp.jid.UserJid r3 = r0.A0X     // Catch:{ RuntimeException -> 0x0cf7 }
            r6 = 0
            if (r3 == 0) goto L_0x0095
            com.whatsapp.jid.DeviceJid r3 = r0.A0V     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C17960vV.A07(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.UserJid r4 = r3.userJid     // Catch:{ RuntimeException -> 0x0cf7 }
            X.11S r3 = r0.A0C     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r3.A0O(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0095
            boolean r3 = X.C42701yb.A01(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0095
            java.lang.String r1 = "SendE2EMessageJob/cannot send e2e message with recipient other than own devices"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0072:
            X.1O2 r3 = r0.A0f     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.DeviceJid r1 = r0.A0V     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.A04(r1, r9)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0079:
            java.util.concurrent.ConcurrentHashMap r3 = A1A     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2l1 r1 = X.C58642l1.A00(r0)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.remove(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/ e2e message send job finished result = "
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.append(r6)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = " : "
            X.C17900vP.A0f(r1, r2, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0c81
        L_0x0095:
            X.00H r13 = r0.A0q     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1Qw r12 = r0.A0O     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1RP r11 = r0.A0M     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.Jid r10 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            int r8 = r0.messageType     // Catch:{ RuntimeException -> 0x0cf7 }
            java.util.HashSet r4 = r0.targetDeviceRawJids     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2jz r3 = new X.2jz     // Catch:{ RuntimeException -> 0x0cf7 }
            r24 = r3
            r25 = r11
            r26 = r12
            r27 = r10
            r28 = r9
            r29 = r13
            r30 = r4
            r31 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ RuntimeException -> 0x0cf7 }
            r0.A0Z = r3     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2ip r4 = r0.A0h     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 1
            X.206 r12 = r4.A00(r9, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r12 == 0) goto L_0x00dd
            X.8cr r10 = r0.A0j     // Catch:{ RuntimeException -> 0x0cf7 }
            X.0ve r8 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C18070vi.A0d(r8, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r10 == 0) goto L_0x011c
            int r4 = r10.bitField1_     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r4 & 16
            if (r3 != 0) goto L_0x00f8
            r3 = r4 & 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x00f8
            r3 = r4 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x00f8
            r3 = r4 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0108
            goto L_0x00ec
        L_0x00dd:
            int r10 = r0.messageType     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 58
            if (r10 == r3) goto L_0x012e
            r3 = 69
            if (r10 == r3) goto L_0x012e
            r3 = 77
            if (r10 != r3) goto L_0x00f8
            goto L_0x012e
        L_0x00ec:
            X.8ap r3 = r10.pollUpdateMessage_     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x00f2
            X.8ap r3 = X.C165248ap.DEFAULT_INSTANCE     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x00f2:
            int r3 = r3.bitField0_     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0108
        L_0x00f8:
            boolean r3 = r12 instanceof X.AnonymousClass213     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0136
            X.1hb r3 = r0.A0J     // Catch:{ RuntimeException -> 0x0cf7 }
            X.213 r12 = (X.AnonymousClass213) r12     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r12 = r3.A01(r12)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 1
            r0.A0t = r3     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0136
        L_0x0108:
            r3 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r3
            boolean r3 = X.AnonymousClass000.A1O(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x011c
            r4 = 4164(0x1044, float:5.835E-42)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18020vd.A05(r3, r8, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x011c
            goto L_0x00f8
        L_0x011c:
            boolean r3 = X.AnonymousClass206.A08(r12)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x00f8
            X.36k r3 = X.C60472o5.A00(r12)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x00f8
            X.1Qe r3 = r0.A0T     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.A05(r12)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x00f8
        L_0x012e:
            X.207 r8 = r0.A0S     // Catch:{ RuntimeException -> 0x0cf7 }
            long r3 = r0.messageSendStartTime     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r12 = r8.A00(r9, r10, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0136:
            if (r12 == 0) goto L_0x0166
            X.0ve r8 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 5623(0x15f7, float:7.88E-42)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18020vd.A05(r3, r8, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0166
            X.205 r3 = r12.A0v     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1BI r4 = r3.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C22971Dz.A0T(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0166
            X.1CJ r3 = r0.A0H     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1ci r3 = r3.A0A(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x015a
            X.2Qs r3 = r3.A0b     // Catch:{ RuntimeException -> 0x0cf7 }
            r12.A0J = r3     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x015a:
            X.2Qs r3 = r12.A0J     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0166
            X.9oM r3 = r0.A0G     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2Qs r3 = r3.A00(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            r12.A0J = r3     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0166:
            r0.A0l = r12     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2eO r11 = r0.A0o     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.Jid r10 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C18070vi.A0d(r10, r6)     // Catch:{ RuntimeException -> 0x0cf7 }
            r8 = 1
            boolean r3 = r10 instanceof X.AnonymousClass1E2     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0181
            boolean r3 = r10 instanceof X.C42521yJ     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0184
            X.1yJ r10 = (X.C42521yJ) r10     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.UserJid r10 = r10.userJid     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r10, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0181:
            X.1E2 r10 = (X.AnonymousClass1E2) r10     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0185
        L_0x0184:
            r10 = 0
        L_0x0185:
            r21 = 0
            if (r10 == 0) goto L_0x0197
            if (r12 == 0) goto L_0x01db
            int r4 = r12.A0u     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 73
            if (r4 == r3) goto L_0x0197
            X.2Qs r4 = r12.A0J     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2Qs r3 = X.C49502Qs.USERNAME     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 != r3) goto L_0x01db
        L_0x0197:
            X.2jM r8 = r0.A0p     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.Jid r4 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r3 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r24 = r8.A00(r4, r3, r9)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.8cr r3 = r0.A0j     // Catch:{ RuntimeException -> 0x0cf7 }
            int r3 = r3.bitField0_     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x021d
            X.206 r3 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x021d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/e2e message was deleted from message store"
            X.C17900vP.A0f(r1, r2, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.8cr r3 = r0.A0j     // Catch:{ RuntimeException -> 0x0cf7 }
            int r1 = r3.bitField1_     // Catch:{ RuntimeException -> 0x0cf7 }
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0072
            X.8aA r3 = r3.keepInChatMessage_     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x01c6
            X.8aA r3 = X.C164848aA.DEFAULT_INSTANCE     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0209
        L_0x01c6:
            int r1 = r3.bitField0_     // Catch:{ RuntimeException -> 0x0cf7 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0207
            int r1 = r3.keepType_     // Catch:{ RuntimeException -> 0x0cf7 }
            X.9KJ r3 = X.AnonymousClass9KJ.A00(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x01d6
            X.9KJ r3 = X.AnonymousClass9KJ.UNKNOWN     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x01d6:
            X.9KJ r1 = X.AnonymousClass9KJ.UNDO_KEEP_FOR_ALL     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != r1) goto L_0x0207
            goto L_0x0209
        L_0x01db:
            boolean r3 = r9.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0197
            X.00H r3 = r11.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.Object r3 = r3.get()     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1CJ r3 = (X.AnonymousClass1CJ) r3     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1ci r3 = X.AnonymousClass1CJ.A00(r3, r10)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x01f4
            X.2Qs r4 = r3.A0b     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2Qs r3 = X.C49502Qs.GENERAL     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 != r3) goto L_0x01f4
            goto L_0x0197
        L_0x01f4:
            X.1RL r3 = r11.A01     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.Boolean r3 = r3.A06(r10)     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18070vi.A19(r3, r8)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0197
            X.1Ln r3 = r11.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.PhoneUserJid r21 = r3.A0D(r10)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0197
        L_0x0207:
            r5 = 0
            goto L_0x020a
        L_0x0209:
            r5 = 1
        L_0x020a:
            X.190 r4 = r0.A0A     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "isUnkeep? "
            java.lang.String r3 = X.C17900vP.A0D(r1, r3, r5)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/unkeep-failed-msg-deleted"
            r4.A0G(r1, r3, r6)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0072
        L_0x021d:
            X.206 r11 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            r10 = 0
            if (r11 == 0) goto L_0x0265
            boolean r3 = r11 instanceof X.AnonymousClass21L     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0239
            r3 = r11
            X.21L r3 = (X.AnonymousClass21L) r3     // Catch:{ RuntimeException -> 0x0cf7 }
            X.AEt r8 = r3.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r8 == 0) goto L_0x0239
            X.AEn r4 = r8.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 == 0) goto L_0x0237
            java.lang.String r3 = r4.A05     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0237
            r4.A05 = r10     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0237:
            r8.A02 = r4     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0239:
            boolean r3 = r0.A0t     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0265
            boolean r3 = r11 instanceof X.AnonymousClass212     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0265
            boolean r3 = r11 instanceof X.C442522s     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0265
            X.121 r3 = r0.A0I     // Catch:{ RuntimeException -> 0x0cf7 }
            int r18 = r3.BYx(r11)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x024b:
            X.11P r3 = r0.A0D     // Catch:{ RuntimeException -> 0x0cf7 }
            long r10 = X.AnonymousClass11P.A01(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            long r3 = r0.expireTimeMs     // Catch:{ RuntimeException -> 0x0cf7 }
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x026a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/e2e message send job expired"
            X.C17900vP.A0f(r1, r2, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r1 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r1 == 0) goto L_0x0072
            goto L_0x0268
        L_0x0265:
            r18 = 0
            goto L_0x024b
        L_0x0268:
            r4 = 5
            goto L_0x0285
        L_0x026a:
            X.206 r8 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r8 == 0) goto L_0x0296
            X.11P r3 = r0.A0D     // Catch:{ RuntimeException -> 0x0cf7 }
            long r3 = X.AnonymousClass11P.A01(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.AnonymousClass25A.A0y(r8, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0296
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/e2e message is ephemerally expired"
            X.C17900vP.A0f(r1, r2, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 15
        L_0x0285:
            X.206 r1 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r1 == 0) goto L_0x0072
            boolean r1 = r0.A06()     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r1 ^ 1
            r1 = r18
            r0.A03(r4, r3, r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0072
        L_0x0296:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "SendE2EMessageJob/running e2e message send job"
            X.C17900vP.A0f(r3, r2, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            int r4 = r0.retryCount     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 4
            if (r4 <= r3) goto L_0x02af
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to high retry count"
        L_0x02aa:
            X.C17900vP.A0g(r1, r2, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0072
        L_0x02af:
            X.2jz r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x0cf7 }
            java.util.Set r25 = r3.A00()     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r0.A05()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x02c8
            boolean r3 = r25.isEmpty()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x02c8
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to empty target devices"
            goto L_0x02aa
        L_0x02c8:
            X.11S r3 = r0.A0C     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r3.A0S(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x02dd
            boolean r3 = r25.isEmpty()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x02dd
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/aborting e2e message send job due to empty deviceEncryptedMessages for self-thread"
            goto L_0x02aa
        L_0x02dd:
            X.206 r8 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C62832s4.A01(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0317
            boolean r3 = X.C62832s4.A02(r25)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0317
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "msg_send: "
            r4.append(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r8 == 0) goto L_0x02fd
            int r3 = r8.A0u     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x02ff
        L_0x02fd:
            java.lang.String r3 = "null"
        L_0x02ff:
            r4.append(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = ";"
            r4.append(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            int r3 = r1.getType()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r8 = X.C17880vN.A0t(r4, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.190 r4 = r0.A0A     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "unexpected-hosted-device"
            r4.A0G(r3, r8, r6)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0317:
            boolean r3 = r0.A0s     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0328
            X.1PT r6 = r0.A0i     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = r0.id     // Catch:{ RuntimeException -> 0x0cf7 }
            int r4 = r3.hashCode()     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 8
            r6.A07(r4, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0328:
            X.1PT r4 = r0.A0i     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = r0.id     // Catch:{ RuntimeException -> 0x0cf7 }
            int r10 = r3.hashCode()     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r3 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0481
            int r8 = r3.A0u     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0336:
            r6 = 7
            boolean r3 = r4.A0b     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0341
            X.1Np r4 = r4.A0G     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = -1
            r4.A04(r10, r6, r3, r8)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0341:
            X.0ve r8 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2se r3 = r0.A0a     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C18070vi.A0h(r8, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r3.A02()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x046b
            X.2Qd r19 = X.C49352Qd.DISABLED     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0350:
            X.0ve r8 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2se r3 = r0.A0a     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C18070vi.A0h(r8, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r3.A02()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0455
            X.2Qd r20 = X.C49352Qd.DISABLED     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x035f:
            com.whatsapp.jid.Jid r3 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = r3.user     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C42701yb.A02(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0451
            com.whatsapp.jid.Jid r3 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C22971Dz.A0M(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0451
            X.0ve r6 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 11965(0x2ebd, float:1.6767E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18020vd.A05(r3, r6, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0451
            com.whatsapp.jid.Jid r3 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            com.whatsapp.jid.UserJid r8 = X.C42701yb.A00(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0383:
            X.0ve r3 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            r39 = r3
            X.190 r3 = r0.A0A     // Catch:{ RuntimeException -> 0x0cf7 }
            r32 = r3
            X.11S r3 = r0.A0C     // Catch:{ RuntimeException -> 0x0cf7 }
            r33 = r3
            X.1PT r3 = r0.A0i     // Catch:{ RuntimeException -> 0x0cf7 }
            r46 = r3
            X.A8R r3 = r0.A0Y     // Catch:{ RuntimeException -> 0x0cf7 }
            r40 = r3
            X.1P3 r3 = r0.A0F     // Catch:{ RuntimeException -> 0x0cf7 }
            r35 = r3
            X.1U5 r3 = r0.A0P     // Catch:{ RuntimeException -> 0x0cf7 }
            r37 = r3
            X.2aP r3 = r0.A0Q     // Catch:{ RuntimeException -> 0x0cf7 }
            r38 = r3
            X.1MZ r3 = r0.A0L     // Catch:{ RuntimeException -> 0x0cf7 }
            r36 = r3
            X.2se r3 = r0.A0a     // Catch:{ RuntimeException -> 0x0cf7 }
            r42 = r3
            X.1P1 r3 = r0.A0E     // Catch:{ RuntimeException -> 0x0cf7 }
            r34 = r3
            X.0zA r3 = r0.A05     // Catch:{ RuntimeException -> 0x0cf7 }
            r27 = r3
            X.0zA r3 = r0.A09     // Catch:{ RuntimeException -> 0x0cf7 }
            r28 = r3
            X.2jz r3 = r0.A0Z     // Catch:{ RuntimeException -> 0x0cf7 }
            r41 = r3
            X.0zA r3 = r0.A06     // Catch:{ RuntimeException -> 0x0cf7 }
            r29 = r3
            X.0zA r3 = r0.A08     // Catch:{ RuntimeException -> 0x0cf7 }
            r30 = r3
            X.0zA r3 = r0.A07     // Catch:{ RuntimeException -> 0x0cf7 }
            r31 = r3
            java.lang.String r50 = r8.getRawString()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r15 = r0.recipientRawJid     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r14 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            X.8cr r13 = r0.A0j     // Catch:{ RuntimeException -> 0x0cf7 }
            byte[] r12 = r0.ephemeralSharedSecret     // Catch:{ RuntimeException -> 0x0cf7 }
            java.util.HashMap r11 = r0.broadcastParticipantEphemeralSettings     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2kT r10 = r0.A0e     // Catch:{ RuntimeException -> 0x0cf7 }
            int r6 = r0.retryCount     // Catch:{ RuntimeException -> 0x0cf7 }
            int r4 = r0.editVersion     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r0.useLidForEncryption     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r58 = r0.A06()     // Catch:{ RuntimeException -> 0x0cf7 }
            X.343 r26 = new X.343     // Catch:{ RuntimeException -> 0x0cf7 }
            r43 = r19
            r44 = r20
            r45 = r10
            r47 = r13
            r48 = r14
            r49 = r9
            r51 = r15
            r52 = r2
            r53 = r11
            r54 = r12
            r55 = r6
            r56 = r4
            r57 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.9ry r3 = r0.A0k     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x040d
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "SendE2EMessageJob/reusing encrypted payloads from previous run for job:"
            X.C17900vP.A0f(r3, r2, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x040d:
            X.206 r12 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r12 == 0) goto L_0x044b
            boolean r3 = r0.A0t     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x044b
            boolean r3 = r12 instanceof X.AnonymousClass212     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x044b
            boolean r3 = r12 instanceof X.C442522s     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x044b
            X.121 r11 = r0.A0I     // Catch:{ RuntimeException -> 0x0cf7 }
            int r10 = r18 + 1
            X.122 r11 = (X.AnonymousClass122) r11     // Catch:{ RuntimeException -> 0x0cf7 }
            r12.A1H = r10     // Catch:{ RuntimeException -> 0x0cf7 }
            X.00H r3 = r11.A16     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1gM r6 = X.C17880vN.A0L(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 1
            X.3Cu r3 = new X.3Cu     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.<init>(r11, r10, r4, r12)     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 24
            r6.A01(r3, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0436:
            X.0ve r12 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            X.11S r11 = r0.A0C     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1CJ r10 = r0.A0H     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1MS r6 = r0.A0K     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r4 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r4 instanceof X.AnonymousClass212     // Catch:{ RuntimeException -> 0x0cf7 }
            r13 = 1
            if (r3 == 0) goto L_0x0485
            boolean r3 = X.C22971Dz.A0g(r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x05d7
        L_0x044b:
            java.lang.String r3 = "SendE2EMessageJob/onRun: Not saving to count store. FMessage is null or doesn't support counter."
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0436
        L_0x0451:
            com.whatsapp.jid.Jid r8 = r0.A0W     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0383
        L_0x0455:
            X.0z2 r6 = X.C49352Qd.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 7821(0x1e8d, float:1.096E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            int r3 = X.C18020vd.A00(r3, r8, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.Object r20 = r6.get(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r20
            X.2Qd r3 = (X.C49352Qd) r3     // Catch:{ RuntimeException -> 0x0cf7 }
            r20 = r3
            goto L_0x035f
        L_0x046b:
            X.0z2 r6 = X.C49352Qd.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 7820(0x1e8c, float:1.0958E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            int r3 = X.C18020vd.A00(r3, r8, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.Object r19 = r6.get(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r19
            X.2Qd r3 = (X.C49352Qd) r3     // Catch:{ RuntimeException -> 0x0cf7 }
            r19 = r3
            goto L_0x0350
        L_0x0481:
            int r8 = r0.messageType     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0336
        L_0x0485:
            boolean r3 = r4 instanceof X.AnonymousClass22A     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x05de
            r3 = r4
            X.22A r3 = (X.AnonymousClass22A) r3     // Catch:{ RuntimeException -> 0x0cf7 }
            int r3 = r3.A01     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x05de
        L_0x0490:
            boolean r3 = r4 instanceof X.AnonymousClass23Q     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x0496
            if (r13 == 0) goto L_0x04c9
        L_0x0496:
            X.205 r3 = r4.A0v     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1BI r13 = r3.A00     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = r13 instanceof X.AnonymousClass1E9     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x04c9
            X.1E9 r13 = (X.AnonymousClass1E9) r13     // Catch:{ RuntimeException -> 0x0cf7 }
            int r5 = r4.A0u     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 3069(0xbfd, float:4.3E-42)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18020vd.A05(r3, r12, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x04c9
            boolean r3 = r10.A0R(r13)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x04c9
            r3 = 15
            if (r5 == r3) goto L_0x04bb
            r3 = 68
            if (r5 == r3) goto L_0x04bb
            goto L_0x04c9
        L_0x04bb:
            X.2tp r3 = r6.A0A(r13)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x04c9
            boolean r3 = r3.A0X(r11)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r3 ^ 1
            if (r3 != 0) goto L_0x05db
        L_0x04c9:
            boolean r3 = r0.useOneOneEncryptionOnPHashMismatch     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x05e1
            X.0zA r3 = r0.A09     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r4 = r3.A07()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 == 0) goto L_0x04df
            r3.A03()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            throw r1     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x04df:
            boolean r3 = r1 instanceof X.AnonymousClass1E9     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x05e1
            java.lang.String r3 = r0.participant     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x05e1
            boolean r3 = r0.A05()     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x05db
            r13 = r1
            X.1E9 r13 = (X.AnonymousClass1E9) r13     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r5 = r0.useParticipantUserHash     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1MZ r3 = r0.A0L     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r4 = r0.useLidForEncryption     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r5 == 0) goto L_0x050b
            java.lang.String r4 = r3.A07(r13, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = r0.groupParticipantUserHash     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0502:
            boolean r3 = r4.equals(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x05e1
            goto L_0x051f
        L_0x050b:
            X.1MW r3 = r3.A08     // Catch:{ RuntimeException -> 0x0cf7 }
            X.2tp r3 = r3.A0C(r13)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 == 0) goto L_0x051a
            java.lang.String r4 = r3.A0G()     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0517:
            java.lang.String r3 = r0.groupParticipantHash     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0502
        L_0x051a:
            java.lang.String r4 = r3.A0I()     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x0517
        L_0x051f:
            X.206 r3 = r0.A0l     // Catch:{ Exception -> 0x05d0 }
            if (r3 == 0) goto L_0x05db
            boolean r3 = X.AnonymousClass25A.A0p(r3)     // Catch:{ Exception -> 0x05d0 }
            if (r3 != 0) goto L_0x05db
            X.0ve r5 = r0.A0R     // Catch:{ Exception -> 0x05d0 }
            r4 = 9411(0x24c3, float:1.3188E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ Exception -> 0x05d0 }
            boolean r3 = X.C18020vd.A05(r3, r5, r4)     // Catch:{ Exception -> 0x05d0 }
            if (r3 == 0) goto L_0x05db
            X.1MZ r3 = r0.A0L     // Catch:{ Exception -> 0x05d0 }
            java.util.HashSet r5 = r3.A08(r13)     // Catch:{ Exception -> 0x05d0 }
            X.2jz r3 = r0.A0Z     // Catch:{ Exception -> 0x05d0 }
            java.util.Set r4 = r3.A00()     // Catch:{ Exception -> 0x05d0 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x05d0 }
            r12.<init>(r5)     // Catch:{ Exception -> 0x05d0 }
            r12.removeAll(r4)     // Catch:{ Exception -> 0x05d0 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x05d0 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x05d0 }
            r3.removeAll(r5)     // Catch:{ Exception -> 0x05d0 }
            boolean r4 = r12.isEmpty()     // Catch:{ Exception -> 0x05d0 }
            r11 = 0
            java.lang.String r14 = "directed-message-"
            if (r4 == 0) goto L_0x0574
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x05d0 }
            if (r3 != 0) goto L_0x0574
            X.190 r5 = r0.A0A     // Catch:{ Exception -> 0x05d0 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x05d0 }
            int r3 = X.C64002u3.A04(r13)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r3 = "removed"
            r5.A0G(r4, r3, r11)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x05db
        L_0x0574:
            boolean r3 = r12.isEmpty()     // Catch:{ Exception -> 0x05d0 }
            if (r3 != 0) goto L_0x05bc
            X.1MZ r3 = r0.A0L     // Catch:{ Exception -> 0x05d0 }
            X.1MW r3 = r3.A08     // Catch:{ Exception -> 0x05d0 }
            X.2tp r10 = r3.A0B(r13)     // Catch:{ Exception -> 0x05d0 }
            X.0ve r6 = r0.A0R     // Catch:{ Exception -> 0x05d0 }
            X.11S r5 = r0.A0C     // Catch:{ Exception -> 0x05d0 }
            X.2se r4 = r0.A0a     // Catch:{ Exception -> 0x05d0 }
            boolean r3 = r0.useLidForEncryption     // Catch:{ Exception -> 0x05d0 }
            java.util.HashSet r3 = r10.A0N(r5, r6, r4, r3)     // Catch:{ Exception -> 0x05d0 }
            boolean r3 = r12.equals(r3)     // Catch:{ Exception -> 0x05d0 }
            if (r3 == 0) goto L_0x05a8
            X.190 r5 = r0.A0A     // Catch:{ Exception -> 0x05d0 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x05d0 }
            int r3 = X.C64002u3.A04(r13)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r3 = "added"
            r5.A0G(r4, r3, r11)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x05db
        L_0x05a8:
            X.190 r5 = r0.A0A     // Catch:{ Exception -> 0x05d0 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x05d0 }
            int r3 = X.C64002u3.A04(r13)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r3 = "mixed"
            r5.A0G(r4, r3, r11)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x05db
        L_0x05bc:
            X.190 r5 = r0.A0A     // Catch:{ Exception -> 0x05d0 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x05d0 }
            int r3 = X.C64002u3.A04(r13)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ Exception -> 0x05d0 }
            java.lang.String r3 = "others"
            r5.A0G(r4, r3, r11)     // Catch:{ Exception -> 0x05d0 }
            goto L_0x05db
        L_0x05d0:
            r4 = move-exception
            java.lang.String r3 = "Error logging directed message send"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            goto L_0x05db
        L_0x05d7:
            if (r3 == 0) goto L_0x0485
            if (r5 != 0) goto L_0x0485
        L_0x05db:
            r28 = 1
            goto L_0x05e3
        L_0x05de:
            r13 = 0
            goto L_0x0490
        L_0x05e1:
            r28 = 0
        L_0x05e3:
            boolean r3 = r1 instanceof X.AnonymousClass1E9     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x05eb
            r27 = 1
            if (r7 == 0) goto L_0x05ed
        L_0x05eb:
            r27 = 0
        L_0x05ed:
            X.A8R r6 = r0.A0Y     // Catch:{ RuntimeException -> 0x0cf7 }
            X.0ve r10 = r0.A0R     // Catch:{ RuntimeException -> 0x0cf7 }
            X.8cr r3 = r0.A0j     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r5 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            X.8cr r4 = X.C196709vV.A01(r10, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.1i4 r3 = r6.A03     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r6 = X.A8F.A07(r3, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "sticker"
            boolean r3 = X.AnonymousClass026.A00(r6, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x062e
            boolean r3 = r5 instanceof X.C441322g     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x062e
            r3 = 0
            X.C18070vi.A0d(r10, r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r4 = 9895(0x26a7, float:1.3866E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ RuntimeException -> 0x0cf7 }
            boolean r3 = X.C18020vd.A05(r3, r10, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x062e
            X.22g r5 = (X.C441322g) r5     // Catch:{ RuntimeException -> 0x0cf7 }
            X.73B r4 = r5.A05     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r4 == 0) goto L_0x062e
            boolean r3 = r4.A03     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 != 0) goto L_0x062c
            boolean r3 = r4.A0G     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x062e
            java.lang.String r6 = "user_created_sticker"
            goto L_0x062e
        L_0x062c:
            java.lang.String r6 = "1p_sticker"
        L_0x062e:
            com.whatsapp.jid.UserJid r11 = r0.A0X     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r10 = r9.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r3 = r0.editVersion     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x06ab
            java.lang.String r5 = java.lang.Integer.toString(r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x063a:
            X.2lD r4 = new X.2lD     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A02 = r8     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r3 = "message"
            r4.A06 = r3     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A08 = r10     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A01 = r7     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A03 = r11     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A07 = r5     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2nR r34 = r4.A00()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r14 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r13 = r0.messageType     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r0.originationFlags     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            com.whatsapp.jid.UserJid r12 = r0.A0X     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r11 = r0.editVersion     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r10 = r0.broadcastListName     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.A1O r3 = new X.A1O     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r29 = r3
            r30 = r7
            r31 = r8
            r32 = r12
            r33 = r9
            r35 = r10
            r36 = r6
            r37 = r14
            r38 = r13
            r39 = r11
            r40 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r14 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2iE r4 = r0.A0c     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r4.A00(r14)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r13 = 0
            if (r4 == 0) goto L_0x06af
            X.2jz r4 = r0.A0Z     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.Set r12 = r4.A00()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.190 r4 = r0.A0A     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C22971Dz.A0F(r4, r12, r11)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r10 = r12.size()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.205 r4 = r14.A0v     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1BI r8 = r4.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = X.C22971Dz.A0e(r8)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x06b2
            X.0ve r7 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r5 = 3168(0xc60, float:4.44E-42)
            X.0vf r4 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r4 = X.C18020vd.A00(r4, r7, r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x06ad
        L_0x06ab:
            r5 = 0
            goto L_0x063a
        L_0x06ad:
            if (r10 <= r4) goto L_0x06b2
        L_0x06af:
            r7 = r13
            goto L_0x075a
        L_0x06b2:
            int r4 = r12.size()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r5 = X.C22971Dz.A0a(r8)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x06f0
            X.0ve r8 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.0vf r7 = X.C18040vf.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r5 = 11104(0x2b60, float:1.556E-41)
            boolean r5 = X.C18020vd.A05(r7, r8, r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x06f0
            r5 = 100
            if (r4 >= r5) goto L_0x06cd
            goto L_0x06e1
        L_0x06cd:
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 >= r5) goto L_0x06d6
            X.0ve r7 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r5 = 11540(0x2d14, float:1.6171E-41)
            goto L_0x06e5
        L_0x06d6:
            X.0ve r7 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r8 = 300(0x12c, float:4.2E-43)
            r5 = 11542(0x2d16, float:1.6174E-41)
            if (r4 >= r8) goto L_0x06e5
            r5 = 11541(0x2d15, float:1.6172E-41)
            goto L_0x06e5
        L_0x06e1:
            X.0ve r7 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r5 = 11539(0x2d13, float:1.617E-41)
        L_0x06e5:
            X.0vf r4 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = X.C18020vd.A05(r4, r7, r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x06f0
            goto L_0x06af
        L_0x06f0:
            X.1gU r5 = r0.A0b     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = 0
            X.C18070vi.A0d(r5, r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r14 instanceof X.AnonymousClass210     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r8 = 0
            if (r4 == 0) goto L_0x0720
            java.lang.String r4 = r14.A0P()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r7 = r5.A02(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = r14
            X.210 r4 = (X.AnonymousClass210) r4     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = r4.A07     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0712
            int r5 = r4.length()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x0712
            r7 = r4
            goto L_0x0714
        L_0x0712:
            if (r7 == 0) goto L_0x0720
        L_0x0714:
            java.lang.String r4 = X.C32011gU.A00(r7)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r8 = X.C63712tZ.A02(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0720:
            X.2sd r7 = r0.A0d     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.210 r14 = (X.AnonymousClass210) r14     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.11S r4 = r7.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0730
            byte[] r13 = r7.A01(r4, r14, r8)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0730:
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0738:
            boolean r4 = r11.hasNext()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x074e
            com.whatsapp.jid.UserJid r10 = X.C17880vN.A0T(r11)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            byte[] r4 = r7.A01(r10, r14, r8)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x0749
            goto L_0x074d
        L_0x0749:
            r5.put(r10, r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0738
        L_0x074d:
            r5 = 0
        L_0x074e:
            if (r13 == 0) goto L_0x0753
            if (r5 == 0) goto L_0x0753
            goto L_0x0755
        L_0x0753:
            r7 = 0
            goto L_0x075a
        L_0x0755:
            X.9oN r7 = new X.9oN     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r7.<init>(r12, r5, r13)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x075a:
            java.lang.Integer r4 = r0.liveLocationDuration     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r35 = 0
            if (r4 == 0) goto L_0x0783
            X.1W6 r4 = r0.A0n     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1W2 r4 = r4.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r8 = r4.A05(r9)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.219 r8 = (X.AnonymousClass219) r8     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r8 == 0) goto L_0x0783
            X.11P r4 = r0.A0D     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r11 = X.AnonymousClass11P.A01(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r8.A0I     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r10 = r8.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r11 = r11 - r4
            long r4 = X.C17880vN.A04(r11)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r8 = (int) r4     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r10 = r10 - r8
            if (r10 <= 0) goto L_0x0783
            java.lang.Integer r35 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0783:
            X.206 r5 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r5 instanceof X.AnonymousClass24R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.C443823f     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.C444023h     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass227     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass22E     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass22C     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass22A     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass24H     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.C442622t     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass24F     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r4 = r5 instanceof X.AnonymousClass24B     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x085f
            boolean r11 = r5.A1C     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x07b3:
            boolean r4 = r5 instanceof X.C438721g     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x085c
            X.21g r5 = (X.C438721g) r5     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9lY r4 = r0.A0m     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.3M5 r5 = r4.A00(r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r5 instanceof X.C1774598q     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x085c
            X.98q r5 = (X.C1774598q) r5     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.AEb r4 = r5.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x085c
            X.AE2 r4 = r4.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x085c
            java.lang.String r10 = r4.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x07cf:
            X.9ry r4 = r0.A0k     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9mc r8 = new X.9mc     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r8.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r31 = 0
            X.AVM r5 = new X.AVM     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r32 = r5
            r33 = r0
            r34 = r7
            r37 = r10
            r38 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9uN r7 = new X.9uN     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = r26
            r7.<init>(r4, r5, r8)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r15 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.8cr r14 = r0.A0j     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r39 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r13 = r0.botInvokeRawJid     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r40 = r0.A05()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r12 = r0.includeSenderKeysInMessage     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r11 = r0.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r10 = r0.multiDeviceFanOut     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2kT r5 = r0.A0e     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r0.isRetryReceiptLid     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9ty r30 = new X.9ty     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r32 = r30
            r33 = r19
            r34 = r5
            r35 = r14
            r36 = r15
            r37 = r13
            r38 = r25
            r41 = r12
            r42 = r28
            r43 = r11
            r44 = r10
            r45 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = X.C22971Dz.A0e(r1)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0833
            X.206 r4 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0833
            int r4 = r4.A05     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.Integer r31 = java.lang.Integer.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0833:
            X.8cr r13 = r0.A0j     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r0.originationFlags     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r12 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r11 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r10 = 0
            X.C18070vi.A0d(r13, r10)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r29 = 0
            r32 = r29
            r33 = r13
            r34 = r11
            r35 = r6
            r36 = r12
            r37 = r4
            java.lang.String r13 = X.AnonymousClass9AU.A02(r32, r33, r34, r35, r36, r37)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1MZ r5 = r0.A0L     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1nh r4 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            com.whatsapp.jid.GroupJid r4 = X.C36321nh.A00(r1)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x0864
            goto L_0x0862
        L_0x085c:
            r10 = 0
            goto L_0x07cf
        L_0x085f:
            r11 = 1
            goto L_0x07b3
        L_0x0862:
            r12 = 0
            goto L_0x086c
        L_0x0864:
            boolean r4 = r5.A0I(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0879
            java.lang.String r12 = "lid"
        L_0x086c:
            long r4 = r0.originalTimestamp     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r11 = r0.groupParticipantHash     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r26 = r0.A05()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x087c
        L_0x0879:
            java.lang.String r12 = "pn"
            goto L_0x086c
        L_0x087c:
            int r14 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x088e
            long r4 = X.C17880vN.A04(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = "t"
            X.C17890vO.A11(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x088e:
            com.whatsapp.jid.Jid r14 = r3.A06     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.205 r5 = r3.A08     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r5.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x08b5
            int r15 = r3.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = 8
            if (r15 == r4) goto L_0x08b5
            java.lang.String r4 = "from"
        L_0x089e:
            X.C17960vV.A07(r14)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C17890vO.A0n(r14, r4, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = "type"
            X.C17890vO.A11(r4, r13, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r5 = r5.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C18070vi.A0X(r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = "id"
            X.C17890vO.A11(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x08b9
        L_0x08b5:
            java.lang.String r4 = "to"
            goto L_0x089e
        L_0x08b9:
            if (r11 == 0) goto L_0x08c0
            java.lang.String r4 = "phash"
            X.C17890vO.A11(r4, r11, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08c0:
            if (r12 == 0) goto L_0x08c7
            java.lang.String r4 = "addressing_mode"
            X.C17890vO.A11(r4, r12, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08c7:
            com.whatsapp.jid.DeviceJid r5 = r3.A05     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x08d0
            java.lang.String r4 = "participant"
            X.C17890vO.A0n(r5, r4, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08d0:
            com.whatsapp.jid.UserJid r5 = r3.A07     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x08d9
            java.lang.String r4 = "recipient"
            X.C17890vO.A0n(r5, r4, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08d9:
            if (r21 == 0) goto L_0x08e2
            java.lang.String r5 = "recipient_pn"
            r4 = r21
            X.C17890vO.A0n(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08e2:
            if (r24 == 0) goto L_0x08eb
            java.lang.String r5 = "recipient_username"
            r4 = r24
            X.C17890vO.A11(r5, r4, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08eb:
            int r5 = r3.A01     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r5 == 0) goto L_0x08f8
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = "edit"
            X.C17890vO.A11(r4, r11, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x08f8:
            if (r31 == 0) goto L_0x0914
            int r4 = r31.intValue()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 <= 0) goto L_0x0914
            int r4 = r3.A03     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x0914
            r4 = 7
            if (r5 == r4) goto L_0x0914
            r4 = 8
            if (r5 == r4) goto L_0x0914
            java.lang.String r5 = r31.toString()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r4 = "expiration"
            X.C17890vO.A11(r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0914:
            if (r26 == 0) goto L_0x091d
            java.lang.String r5 = "device_fanout"
            java.lang.String r4 = "false"
            X.C17890vO.A11(r5, r4, r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x091d:
            r3.A02(r6)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2im r4 = r0.A0U     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.List r4 = r4.A00()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x092a:
            boolean r4 = r11.hasNext()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x094b
            java.lang.Object r6 = r11.next()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.3Lz r6 = (X.C72443Lz) r6     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9IM r5 = r6.Ba7()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C18070vi.A0d(r5, r10)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.Set r4 = r7.A04     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r4.contains(r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 != 0) goto L_0x092a
            r4 = r30
            r6.BLq(r7, r4, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x092a
        L_0x094b:
            X.9s0 r4 = r8.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a4e
            java.util.Map r4 = r4.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a4e
            int r37 = r4.size()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0957:
            X.206 r4 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a10
            int r4 = r4.A0A     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r24 = r4
            X.11P r4 = r0.A0D     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r52 = android.os.SystemClock.uptimeMillis()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r54 = X.AnonymousClass11P.A01(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r0.A03     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x09b6
            X.1PT r4 = r0.A0i     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r21 = r4
            X.206 r4 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r17 = r4
            int r4 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r16 = r4
            boolean r15 = r0.A0u     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r14 = r0.A0s     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r13 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r12 = r0.A0r     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r50 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r6 = r0.A03     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r0.A04     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r6 = r6 - r4
            long r4 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r10 = r0.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r4 = r4 - r10
            r33 = 8
            r38 = 0
            r45 = r6
            r30 = r21
            r31 = r17
            r32 = r25
            r34 = r18
            r35 = r16
            r36 = r13
            r39 = r38
            r40 = r24
            r41 = r6
            r43 = r4
            r47 = r15
            r48 = r14
            r49 = r12
            r51 = r28
            X.AnonymousClass1PT.A05(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r48, r49, r50, r51)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x09b6:
            X.1PT r14 = r0.A0i     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r13 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r12 = r0.retryCount     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r11 = r0.A0u     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r10 = r0.A0s     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r7 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r6 = r0.A0r     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r61 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r52 = r52 - r22
            long r4 = r0.messageSendStartTime     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r54 = r54 - r4
            long r56 = android.os.SystemClock.uptimeMillis()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            long r56 = r56 - r22
            r4 = 7
            r49 = 0
            r41 = r14
            r42 = r13
            r43 = r25
            r44 = r4
            r45 = r18
            r46 = r12
            r47 = r7
            r50 = r49
            r51 = r24
            r58 = r11
            r59 = r10
            r60 = r6
            r62 = r28
            r48 = r37
            X.AnonymousClass1PT.A05(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r58, r59, r60, r61, r62)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1PT r6 = r0.A0i     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r5 = r0.id     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r5 = r5.hashCode()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r6.A07(r5, r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r4 = r0.A0u     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a10
            X.1O2 r6 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r4 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.205 r5 = r4.A0v     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.Set r4 = r6.A04     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.add(r5)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0a10:
            X.9s0 r4 = r8.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a4b
            java.util.Map r4 = r4.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a4b
            int r16 = r4.size()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0a1c:
            X.206 r4 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r4 == 0) goto L_0x0a49
            int r5 = r4.A0A     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0a22:
            int r6 = r8.A00     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r0.A01 = r6     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r13 = 6
            r10 = r0
            r11 = r4
            r12 = r25
            r14 = r18
            r15 = r5
            r17 = r28
            r10.A0D(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2n2 r11 = r3.A01()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1OZ r10 = r0.A0g     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2nR r7 = r11.A03     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r6 = 0
            r4 = 8
            r3 = r29
            android.os.Message r3 = android.os.Message.obtain(r3, r6, r4, r6, r11)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1Ug r3 = r10.A07(r3, r7)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0a52
        L_0x0a49:
            r5 = 0
            goto L_0x0a22
        L_0x0a4b:
            r16 = 0
            goto L_0x0a1c
        L_0x0a4e:
            r37 = 0
            goto L_0x0957
        L_0x0a52:
            r3.get()     // Catch:{ Exception -> 0x0c47 }
            X.206 r3 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r13 = 3
            r10 = r0
            r11 = r3
            r10.A0D(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r3 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0a85
            X.1PT r7 = r0.A0i     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.206 r3 = r0.A0l     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2qt r4 = new X.2qt     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r6 = 1
            r4.A04 = r6     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A03 = r6     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A02 = r5     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.util.HashSet r3 = r0.targetDeviceRawJids     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r3 = r3.size()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A00 = r3     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A0A = r6     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r3 = r0.A0u     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.A0C = r3     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C62162qt.A00(r4, r7, r12)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0a86
        L_0x0a85:
            r6 = 1
        L_0x0a86:
            if (r28 == 0) goto L_0x0a8c
            boolean r3 = r0.forceSenderKeyDistribution     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0079
        L_0x0a8c:
            if (r27 == 0) goto L_0x0079
            X.9s0 r3 = r8.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0079
            java.util.Map r3 = r3.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0079
            java.util.Set r10 = r3.keySet()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r10 == 0) goto L_0x0079
            boolean r3 = r10.isEmpty()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 != 0) goto L_0x0079
            r10.retainAll(r12)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1E9 r1 = (X.AnonymousClass1E9) r1     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r3 = r0.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0b0a
            X.11S r3 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1yJ r3 = r3.A08()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0ab1:
            X.C17960vV.A07(r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1P3 r8 = r0.A0F     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r7 = r1.getRawString()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2nE r5 = X.C63962tz.A02(r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = r19
            r3 = r20
            X.2nE r3 = X.AnonymousClass1P1.A00(r5, r4, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2nC r4 = new X.2nC     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4.<init>(r3, r7)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1Oy r3 = r8.A08     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2bn r3 = r3.A01(r4)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0c40
            boolean r3 = r0.useLidForEncryption     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0b80
            X.1MZ r3 = r0.A0L     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r3 = r3.A0I(r1)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 != 0) goto L_0x0b80
            X.0ve r7 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.2se r3 = r0.A0a     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.C18070vi.A0h(r7, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r3 = r3.A02()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 == 0) goto L_0x0b01
            r3 = 7821(0x1e8d, float:1.096E-41)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            int r3 = X.C18020vd.A00(r5, r7, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r4 = 0
            if (r3 == r4) goto L_0x0b01
            r3 = 7820(0x1e8c, float:1.0958E-41)
            int r3 = X.C18020vd.A00(r5, r7, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r3 != r4) goto L_0x0b80
        L_0x0b01:
            X.1MZ r4 = r0.A0L     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1Cd r3 = r4.A07     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1au r13 = r3.A05()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0b12
        L_0x0b0a:
            X.11S r3 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r3.A0I()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1E3 r3 = r3.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0ab1
        L_0x0b12:
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x0c36 }
            X.1MW r7 = r4.A08     // Catch:{ all -> 0x0c2c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c2c }
            java.lang.String r3 = "ParticipantUserStore/markParticipantsAsHavingAddOnSenderKey "
            X.C17900vP.A0Y(r10, r3, r4)     // Catch:{ all -> 0x0c2c }
            X.1Cd r3 = r7.A06     // Catch:{ all -> 0x0c2c }
            X.1au r11 = r3.A05()     // Catch:{ all -> 0x0c2c }
            X.1xA r8 = r11.BD0()     // Catch:{ all -> 0x0c22 }
            X.1MV r5 = r7.A07     // Catch:{ all -> 0x0c18 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = "ParticipantDeviceStore/markDevicesAsHavingAddOnSenderKey: "
            r4.append(r3)     // Catch:{ all -> 0x0c18 }
            r4.append(r1)     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = " "
            X.C17900vP.A0Y(r10, r3, r4)     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_add_on_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            X.AnonymousClass1MV.A00(r5, r1, r3, r10)     // Catch:{ all -> 0x0c18 }
            X.2tp r1 = r7.A0B(r1)     // Catch:{ all -> 0x0c18 }
            java.util.Map r1 = r1.A08     // Catch:{ all -> 0x0c18 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0c18 }
            X.10f r1 = X.C199410f.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0c18 }
            X.1IZ r5 = r1.iterator()     // Catch:{ all -> 0x0c18 }
        L_0x0b55:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0c04
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0c18 }
            X.2sr r1 = (X.C63312sr) r1     // Catch:{ all -> 0x0c18 }
            X.10f r1 = r1.A00()     // Catch:{ all -> 0x0c18 }
            X.1IZ r4 = r1.iterator()     // Catch:{ all -> 0x0c18 }
        L_0x0b69:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0b55
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0c18 }
            X.2ly r3 = (X.C59232ly) r3     // Catch:{ all -> 0x0c18 }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x0c18 }
            boolean r1 = r10.contains(r1)     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0b69
            r3.A00 = r6     // Catch:{ all -> 0x0c18 }
            goto L_0x0b69
        L_0x0b80:
            X.1MZ r4 = r0.A0L     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1Cd r3 = r4.A07     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1au r13 = r3.A05()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x0c36 }
            X.1MW r7 = r4.A08     // Catch:{ all -> 0x0c2c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c2c }
            java.lang.String r3 = "ParticipantUserStore/markParticipantsAsHavingSenderKey "
            X.C17900vP.A0Y(r10, r3, r4)     // Catch:{ all -> 0x0c2c }
            X.1Cd r3 = r7.A06     // Catch:{ all -> 0x0c2c }
            X.1au r11 = r3.A05()     // Catch:{ all -> 0x0c2c }
            X.1xA r8 = r11.BD0()     // Catch:{ all -> 0x0c22 }
            X.1MV r5 = r7.A07     // Catch:{ all -> 0x0c18 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = "ParticipantDeviceStore/markDevicesAsHavingSenderKey: "
            r4.append(r3)     // Catch:{ all -> 0x0c18 }
            r4.append(r1)     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = " "
            X.C17900vP.A0Y(r10, r3, r4)     // Catch:{ all -> 0x0c18 }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            X.AnonymousClass1MV.A00(r5, r1, r3, r10)     // Catch:{ all -> 0x0c18 }
            X.2tp r4 = r7.A0B(r1)     // Catch:{ all -> 0x0c18 }
            int r3 = r4.A00     // Catch:{ all -> 0x0c18 }
            r1 = 2
            boolean r1 = X.AnonymousClass000.A1T(r1, r3)     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0bff
            java.util.Map r1 = r4.A08     // Catch:{ all -> 0x0c18 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0c18 }
            X.10f r1 = X.C199410f.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0c18 }
        L_0x0bd0:
            X.1IZ r5 = r1.iterator()     // Catch:{ all -> 0x0c18 }
        L_0x0bd4:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0c04
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0c18 }
            X.2sr r1 = (X.C63312sr) r1     // Catch:{ all -> 0x0c18 }
            X.10f r1 = r1.A00()     // Catch:{ all -> 0x0c18 }
            X.1IZ r4 = r1.iterator()     // Catch:{ all -> 0x0c18 }
        L_0x0be8:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0bd4
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0c18 }
            X.2ly r3 = (X.C59232ly) r3     // Catch:{ all -> 0x0c18 }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x0c18 }
            boolean r1 = r10.contains(r1)     // Catch:{ all -> 0x0c18 }
            if (r1 == 0) goto L_0x0be8
            r3.A01 = r6     // Catch:{ all -> 0x0c18 }
            goto L_0x0be8
        L_0x0bff:
            X.10f r1 = r4.A0B()     // Catch:{ all -> 0x0c18 }
            goto L_0x0bd0
        L_0x0c04:
            r8.A00()     // Catch:{ all -> 0x0c18 }
            r8.close()     // Catch:{ all -> 0x0c22 }
            r11.close()     // Catch:{ all -> 0x0c2c }
            r12.A00()     // Catch:{ all -> 0x0c2c }
            r12.close()     // Catch:{ all -> 0x0c36 }
            r13.close()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0079
        L_0x0c18:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x0c1d }
            goto L_0x0c21
        L_0x0c1d:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x0c22 }
        L_0x0c21:
            throw r3     // Catch:{ all -> 0x0c22 }
        L_0x0c22:
            r3 = move-exception
            r11.close()     // Catch:{ all -> 0x0c27 }
            goto L_0x0c2b
        L_0x0c27:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x0c2c }
        L_0x0c2b:
            throw r3     // Catch:{ all -> 0x0c2c }
        L_0x0c2c:
            r3 = move-exception
            r12.close()     // Catch:{ all -> 0x0c31 }
            goto L_0x0c35
        L_0x0c31:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ all -> 0x0c36 }
        L_0x0c35:
            throw r3     // Catch:{ all -> 0x0c36 }
        L_0x0c36:
            r3 = move-exception
            r13.close()     // Catch:{ all -> 0x0c3b }
            goto L_0x0c3f
        L_0x0c3b:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0c3f:
            throw r3     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0c40:
            java.lang.String r1 = "SendE2EMessageJob/onRun/senderKey doesn't exist after receiving the ack"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            goto L_0x0079
        L_0x0c47:
            r5 = move-exception
            java.lang.Throwable r1 = r5.getCause()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r1 = r1 instanceof X.C31851gE     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r1 = r1 ^ 1
            r0.A0u = r1     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.0ve r4 = r0.A0R     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r3 = 2472(0x9a8, float:3.464E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            if (r1 == 0) goto L_0x0c6d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            java.lang.String r1 = "SendE2EMessageJob/storing encrypted payload for:"
            X.C17900vP.A0f(r1, r2, r3)     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            X.9ry r1 = r8.A00()     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
            r0.A0k = r1     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0c6d:
            throw r5     // Catch:{ OutOfMemoryError -> 0x0c82, 9Kt -> 0x0c6e }
        L_0x0c6e:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/onRun/stop sending message: "
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C17890vO.A13(r2, r3, r4)     // Catch:{ RuntimeException -> 0x0cf7 }
            r6 = 0
            goto L_0x0072
        L_0x0c7e:
            r5 = r7
            goto L_0x0053
        L_0x0c81:
            return
        L_0x0c82:
            r4 = move-exception
            r7 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "SendE2EMessageJob/onRun/out of memory sending message: "
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            r3.append(r2)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = " :forceOneOneEncryption="
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            r1 = r28
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.C17890vO.A0w(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.190 r8 = r0.A0A     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = "msg-send-failure-oom-"
            r3.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r1 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            int r1 = X.C64002u3.A05(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r6 = X.C17880vN.A0t(r3, r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0cf7 }
            int r1 = r0.messageType     // Catch:{ RuntimeException -> 0x0cf7 }
            r5.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r3 = "-"
            r5.append(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            r1 = r28
            r5.append(r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
            int r1 = r25.size()     // Catch:{ RuntimeException -> 0x0cf7 }
            java.lang.String r1 = X.C17880vN.A0t(r5, r1)     // Catch:{ RuntimeException -> 0x0cf7 }
            r8.A0G(r6, r1, r7)     // Catch:{ RuntimeException -> 0x0cf7 }
            X.206 r3 = r0.A0l     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r3 == 0) goto L_0x0ce5
            boolean r1 = r0.A0t     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r1 != 0) goto L_0x0ce5
            boolean r1 = r3 instanceof X.AnonymousClass212     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r1 != 0) goto L_0x0ce5
            boolean r1 = r3 instanceof X.C442522s     // Catch:{ RuntimeException -> 0x0cf7 }
            if (r1 != 0) goto L_0x0ce5
            if (r18 <= 0) goto L_0x0cf6
        L_0x0ce5:
            if (r28 == 0) goto L_0x0ce9
            r3 = 1
            goto L_0x0cf1
        L_0x0ce9:
            if (r27 == 0) goto L_0x0cf0
            boolean r1 = r0.includeSenderKeysInMessage     // Catch:{ RuntimeException -> 0x0cf7 }
            r3 = 2
            if (r1 != 0) goto L_0x0cf1
        L_0x0cf0:
            r3 = 0
        L_0x0cf1:
            com.whatsapp.jobqueue.job.exception.OutOfMemoryException r4 = new com.whatsapp.jobqueue.job.exception.OutOfMemoryException     // Catch:{ RuntimeException -> 0x0cf7 }
            r4.<init>(r3)     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0cf6:
            throw r4     // Catch:{ RuntimeException -> 0x0cf7 }
        L_0x0cf7:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SendE2EMessageJob/ onRun/exception while sending message: "
            X.C17900vP.A0h(r1, r2, r3, r4)
            X.0ve r2 = r0.A0R
            r1 = 7962(0x1f1a, float:1.1157E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0d0e
            throw r4
        L_0x0d0e:
            X.2RL r0 = new X.2RL
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A0A():void");
    }

    public boolean A0C(Exception exc) {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("SendE2EMessageJob/exception while sending e2e message");
        C17890vO.A13(A01(), A102, exc);
        try {
            if (exc instanceof AnonymousClass2RT) {
                this.A0i.A07(this.id.hashCode(), 7);
                AnonymousClass2RT r3 = (AnonymousClass2RT) exc;
                if (r3.encryptionRetryCount > 3) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("SendE2EMessageJob/encryption failure limit reached for ");
                    A103.append(r3.jid);
                    C17890vO.A0w(A103);
                    AnonymousClass1PT r1 = this.A0i;
                    int hashCode = this.id.hashCode();
                    if (r1.A0b) {
                        C25281Np r12 = r1.A0G;
                        if (r12.A07(hashCode)) {
                            r12.A06(hashCode, 3);
                        }
                    }
                    AnonymousClass206 r0 = this.A0l;
                    if (r0 != null) {
                        A03(12, false, r0.A1H);
                        return false;
                    }
                } else {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("SendE2EMessageJob/retrying job due to encryption failure for ");
                    A104.append(r3.jid);
                    A104.append("; encRetryCount ");
                    Log.w(C17880vN.A0t(A104, r3.encryptionRetryCount));
                    return true;
                }
            } else if (exc instanceof OutOfMemoryException) {
                StringBuilder A105 = AnonymousClass000.A10();
                A105.append("SendE2EMessageJob/Cannot send message due to oom ");
                C17890vO.A19(A105, A01());
                A02(17, ((OutOfMemoryException) exc).messageDistributionType, 0);
                return false;
            } else if (exc.getCause() instanceof C31851gE) {
                StringBuilder A106 = AnonymousClass000.A10();
                A106.append("SendE2EMessageJob/Cannot send message due to large payload ");
                C17890vO.A19(A106, A01());
                A02(9, this.A01, ((C31851gE) exc.getCause()).excessPayloadByteSize);
                return false;
            } else if (!(exc instanceof AnonymousClass2RL)) {
                return true;
            } else {
                AnonymousClass206 r02 = this.A0l;
                if (r02 != null) {
                    int i = r02.A1H;
                    if (this.A0l != null) {
                        A03(3, !A06(), i);
                    }
                    this.A11.A01((AnonymousClass3KP) null, this.A0l.A0v, 20);
                }
            }
            return false;
        } catch (Exception e) {
            Log.e(C17900vP.A0C("SendE2EMessageJob/error handling exception ", AnonymousClass000.A10(), exc), e);
            return true;
        }
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        this.A0D = A042.CP7();
        this.A0R = A042.BAL();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A0z = (AnonymousClass1UD) r1.A14.get();
        this.A0B = AnonymousClass10E.A12(r1);
        this.A0A = A042.BG6();
        this.A0C = A042.BA6();
        this.A0H = (AnonymousClass1CJ) r1.A2H.get();
        this.A18 = (JniBridge) r1.A8z.get();
        this.A0b = (C32011gU) r1.A5k.get();
        this.A0g = A042.BAA();
        this.A0q = C000200d.A00(r1.A13);
        this.A0i = (AnonymousClass1PT) r1.A6U.get();
        this.A0G = (C192419oM) r1.A2C.get();
        this.A0S = (AnonymousClass207) r1.A3x.get();
        this.A0I = (AnonymousClass121) r1.A2y.get();
        this.A0n = (AnonymousClass1W6) r1.A3w.get();
        this.A0f = (AnonymousClass1O2) r1.A57.get();
        this.A0N = (C24681Lg) r1.A6Y.get();
        this.A0F = (AnonymousClass1P3) r1.A9y.get();
        this.A11 = (C32331h1) r1.A6d.get();
        AnonymousClass10G r2 = r1.Ao8.A00;
        this.A0o = (C54592eO) r2.A4A.get();
        this.A15 = (C59392mE) r1.A9S.get();
        this.A12 = (C24751Ln) r1.ABe.get();
        this.A0y = (C32541hM) r1.A15.get();
        this.A13 = (AnonymousClass1MB) r1.AAb.get();
        this.A17 = (C35551mQ) r1.A3C.get();
        this.A0h = (C57282ip) r1.A6a.get();
        this.A10 = (C26011Qm) r1.A6Q.get();
        this.A0P = (AnonymousClass1U5) r1.A3L.get();
        this.A0J = (C32691hb) r1.A3a.get();
        this.A0O = (C26111Qw) r1.A9M.get();
        this.A0p = (C57612jM) r2.A4B.get();
        this.A0c = (C56912iE) r1.A2z.get();
        this.A0K = (AnonymousClass1MS) r1.A4s.get();
        this.A0x = (C32501hI) r1.A8Y.get();
        this.A14 = (C27131Uv) r1.A5p.get();
        this.A0d = (C63172sd) r2.A1A.get();
        this.A0Q = (C52122aP) r1.A3i.get();
        this.A0T = (C25931Qe) r1.A3z.get();
        this.A0L = (AnonymousClass1MZ) r1.A4t.get();
        this.A0a = (C63182se) r1.A0b.get();
        this.A0M = (AnonymousClass1RP) r1.A6R.get();
        this.A0E = (AnonymousClass1P1) r1.A3K.get();
        this.A16 = (C29641cc) r1.A75.get();
        C19890zB r0 = C19890zB.A00;
        this.A09 = r0;
        this.A05 = r0;
        this.A08 = r0;
        this.A07 = r0;
        this.A06 = r0;
        this.A0m = (C190809lY) r1.A5S.get();
        this.A0U = (C57252im) r2.A3C.get();
        C18030ve r16 = this.A0R;
        AnonymousClass1UD r15 = this.A0z;
        AnonymousClass11S r14 = this.A0C;
        JniBridge jniBridge = this.A18;
        AnonymousClass00H r11 = this.A0q;
        AnonymousClass1W6 r10 = this.A0n;
        C59392mE r9 = this.A15;
        AnonymousClass1MB r8 = this.A13;
        C24751Ln r7 = this.A12;
        C32541hM r6 = this.A0y;
        C26011Qm r5 = this.A10;
        AnonymousClass1U5 r3 = this.A0P;
        C26111Qw r22 = this.A0O;
        C35551mQ r26 = this.A17;
        C59392mE r24 = r9;
        AnonymousClass1MB r23 = r8;
        C18030ve r222 = r16;
        C32981i4 r21 = (C32981i4) r1.A3G.get();
        AnonymousClass1U5 r20 = r3;
        C24751Ln r19 = r7;
        C26111Qw r18 = r22;
        C26011Qm r17 = r5;
        AnonymousClass1UD r162 = r15;
        C32541hM r152 = r6;
        this.A0Y = new A8R(r14, r152, r162, r17, r18, r19, r20, r21, r222, r23, r24, r10, r26, jniBridge, r11);
        this.A0e = new C58302kT(this.encryptionRetryCounts);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.whatsapp.jid.UserJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r16v2, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement] */
    /* JADX WARNING: type inference failed for: r16v3, types: [com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r29 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r44 <= 0) goto L_0x0007;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendE2EMessageJob(X.C19880zA r28, com.whatsapp.jid.DeviceJid r29, com.whatsapp.jid.Jid r30, com.whatsapp.jid.UserJid r31, com.whatsapp.jid.UserJid r32, X.C166418cr r33, java.lang.Integer r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.util.Map r39, java.util.Set r40, byte[] r41, byte[] r42, int r43, int r44, int r45, long r46, long r48, long r50, long r52, long r54, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64) {
        /*
            r27 = this;
            r1 = r44
            if (r64 == 0) goto L_0x0007
            r2 = 1
            if (r44 > 0) goto L_0x0008
        L_0x0007:
            r2 = 0
        L_0x0008:
            r10 = r31
            r4 = r10
            r3 = r30
            r12 = r3
            r25 = r37
            r20 = r25
            if (r31 != 0) goto L_0x001d
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            r4 = r3
            if (r0 == 0) goto L_0x001d
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            com.whatsapp.jid.UserJid r4 = r4.userJid
        L_0x001d:
            if (r2 == 0) goto L_0x006a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r4.getRawString()
            r2.append(r0)
            java.lang.String r0 = "_retry"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
        L_0x0030:
            X.9lc r5 = new X.9lc
            r5.<init>()
            r5.A00 = r0
            X.3EB r2 = new X.3EB
            r2.<init>()
            java.util.List r0 = r5.A01
            r0.add(r2)
            r2 = 58
            r9 = r43
            if (r9 == r2) goto L_0x0052
            r2 = 69
            if (r9 == r2) goto L_0x0052
            r2 = 77
            if (r9 == r2) goto L_0x0052
            r2 = 1
            r5.A02 = r2
        L_0x0052:
            boolean r2 = r3 instanceof X.AnonymousClass1E9
            r4 = r29
            if (r2 == 0) goto L_0x005b
            r6 = 1
            if (r29 == 0) goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            r13 = r41
            if (r41 == 0) goto L_0x006f
            int r2 = r13.length
            if (r2 != 0) goto L_0x006f
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x006a:
            java.lang.String r0 = r4.getRawString()
            goto L_0x0030
        L_0x006f:
            r14 = r40
            r26 = r36
            r15 = r35
            r7 = r63
            r11 = r60
            r8 = r58
            r23 = r61
            r2 = r45
            if (r6 == 0) goto L_0x0099
            if (r41 != 0) goto L_0x0092
            if (r58 != 0) goto L_0x00d1
            boolean r6 = X.C63792th.A03(r3, r9)
            if (r6 != 0) goto L_0x00d1
            java.lang.String r0 = "cannot use group encryption without including sender key in message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0092:
            java.lang.String r0 = "cannot use group encryption and old alice base key simultaneously"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0099:
            if (r60 == 0) goto L_0x00b7
            r6 = 8
            boolean r6 = X.AnonymousClass000.A1S(r2, r6)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            X.1BI r12 = (X.AnonymousClass1BI) r12
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement
            r16 = r6
            r19 = r15
            r20 = r14
            r21 = r9
            r17 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x00f7
        L_0x00b7:
            if (r29 == 0) goto L_0x00ba
            r12 = r4
        L_0x00ba:
            com.whatsapp.jid.DeviceJid r12 = X.AnonymousClass1E0.A00(r12)
            X.C17960vV.A07(r12)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r6.<init>(r12)
            r0.add(r6)
            if (r41 == 0) goto L_0x00fa
            X.3EF r6 = new X.3EF
            r6.<init>(r12, r13)
            goto L_0x00f7
        L_0x00d1:
            X.1Dv r6 = X.AnonymousClass1BI.A00
            X.1E9 r17 = X.C50242Tr.A00(r3)
            X.C17960vV.A07(r17)
            if (r63 != 0) goto L_0x00de
            r20 = r26
        L_0x00de:
            r6 = 8
            boolean r6 = X.AnonymousClass000.A1S(r2, r6)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement
            r19 = r15
            r21 = r14
            r22 = r9
            r24 = r7
            r16 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x00f7:
            r0.add(r6)
        L_0x00fa:
            if (r32 == 0) goto L_0x0108
            com.whatsapp.jid.DeviceJid r12 = r32.getPrimaryDevice()
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r6 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r6.<init>(r12)
            r0.add(r6)
        L_0x0108:
            r6 = r34
            if (r34 == 0) goto L_0x0114
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r12 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r12.<init>()
            r0.add(r12)
        L_0x0114:
            r12 = r28
            boolean r0 = r12.A07()
            if (r0 == 0) goto L_0x0126
            r12.A03()
            java.lang.String r0 = "getValidVNameRequirement"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0126:
            org.whispersystems.jobqueue.JobParameters r0 = r5.A00()
            r5 = r27
            r5.<init>(r0)
            r0 = 0
            r5.A01 = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r5.encryptionRetryCounts = r0
            r0 = r33
            X.C17960vV.A07(r0)
            r5.A0j = r0
            X.C17960vV.A06(r15)
            r5.id = r15
            java.lang.String r0 = r3.getRawString()
            r5.jid = r0
            r5.A0W = r3
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r3)
            r5.A0V = r0
            java.lang.String r0 = X.C22971Dz.A06(r4)
            r5.participant = r0
            r5.A0X = r10
            java.lang.String r0 = X.C22971Dz.A06(r10)
            r5.recipientRawJid = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            X.C22971Dz.A0H(r14, r0)
            r5.targetDeviceRawJids = r0
            r5.messageType = r9
            r5.retryCount = r1
            r0 = r56
            r5.A0u = r0
            r0 = r57
            r5.isRetryReceiptLid = r0
            r0 = r46
            r5.A0v = r0
            r0 = r26
            r5.groupParticipantHash = r0
            r0 = r25
            r5.groupParticipantUserHash = r0
            r5.includeSenderKeysInMessage = r8
            r0 = r48
            r5.expireTimeMs = r0
            r0 = r50
            r5.messageSendStartTime = r0
            r0 = r52
            r5.originalTimestamp = r0
            r0 = r54
            r5.originationFlags = r0
            r5.editVersion = r2
            r5.liveLocationDuration = r6
            r0 = r59
            r5.useOneOneEncryptionOnPHashMismatch = r0
            r5.multiDeviceFanOut = r11
            r0 = r23
            r5.useLidForEncryption = r0
            r0 = r42
            r5.ephemeralSharedSecret = r0
            r5.A0w = r12
            if (r39 == 0) goto L_0x01d5
            java.util.Set r0 = r39.entrySet()
            java.util.HashMap r8 = X.C17880vN.A11()
            if (r0 == 0) goto L_0x01d6
            java.util.Iterator r6 = r0.iterator()
        L_0x01b7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r6)
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x01b7
            java.lang.String r1 = r0.getRawString()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            goto L_0x01b7
        L_0x01d5:
            r8 = 0
        L_0x01d6:
            r5.broadcastParticipantEphemeralSettings = r8
            r0 = r38
            r5.broadcastListName = r0
            r0 = r62
            r5.forceSenderKeyDistribution = r0
            r5.useParticipantUserHash = r7
            java.lang.String r0 = X.C22971Dz.A06(r32)
            r5.botInvokeRawJid = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SendE2EMessageJob/e2e message send job created"
            r1.append(r0)
            java.lang.String r0 = r5.A01()
            X.C17890vO.A1A(r1, r0)
            r5.A04(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.<init>(X.0zA, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.8cr, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Set, byte[], byte[], int, int, int, long, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
