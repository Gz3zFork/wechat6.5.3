package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class jx extends aqp {
    public String gkz;
    public String gom;
    public String gor;
    public int maG;
    public int mcP;
    public int mmp;
    public LinkedList<arf> mmq = new LinkedList();
    public String mmr;
    public String mms;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.mcP);
            if (this.gom != null) {
                aVar.e(3, this.gom);
            }
            if (this.gor != null) {
                aVar.e(4, this.gor);
            }
            if (this.gkz != null) {
                aVar.e(5, this.gkz);
            }
            aVar.dV(6, this.mmp);
            aVar.d(7, 8, this.mmq);
            if (this.mmr != null) {
                aVar.e(8, this.mmr);
            }
            if (this.mms != null) {
                aVar.e(9, this.mms);
            }
            aVar.dV(10, this.maG);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.dS(2, this.mcP);
            if (this.gom != null) {
                r0 += a.a.a.b.b.a.f(3, this.gom);
            }
            if (this.gor != null) {
                r0 += a.a.a.b.b.a.f(4, this.gor);
            }
            if (this.gkz != null) {
                r0 += a.a.a.b.b.a.f(5, this.gkz);
            }
            r0 = (r0 + a.a.a.a.dS(6, this.mmp)) + a.a.a.a.c(7, 8, this.mmq);
            if (this.mmr != null) {
                r0 += a.a.a.b.b.a.f(8, this.mmr);
            }
            if (this.mms != null) {
                r0 += a.a.a.b.b.a.f(9, this.mms);
            }
            return r0 + a.a.a.a.dS(10, this.maG);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mmq.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            jx jxVar = (jx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        jxVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    jxVar.mcP = aVar3.pMj.mH();
                    return 0;
                case 3:
                    jxVar.gom = aVar3.pMj.readString();
                    return 0;
                case 4:
                    jxVar.gor = aVar3.pMj.readString();
                    return 0;
                case 5:
                    jxVar.gkz = aVar3.pMj.readString();
                    return 0;
                case 6:
                    jxVar.mmp = aVar3.pMj.mH();
                    return 0;
                case 7:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        jxVar.mmq.add(enVar);
                    }
                    return 0;
                case 8:
                    jxVar.mmr = aVar3.pMj.readString();
                    return 0;
                case 9:
                    jxVar.mms = aVar3.pMj.readString();
                    return 0;
                case 10:
                    jxVar.maG = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
