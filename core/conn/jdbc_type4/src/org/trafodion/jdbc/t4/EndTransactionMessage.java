// @@@ START COPYRIGHT @@@
//
// (C) Copyright 2003-2014 Hewlett-Packard Development Company, L.P.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
// @@@ END COPYRIGHT @@@

package org.trafodion.jdbc.t4;

class EndTransactionMessage {
	int m_dialogueId;
	short m_transactionOpt;

	// ----------------------------------------------------------
	EndTransactionMessage(int dialogueId, short transactionOpt) {
		m_dialogueId = dialogueId;
		m_transactionOpt = transactionOpt;
	}

	// ----------------------------------------------------------
	static LogicalByteArray marshal(int dialogueId, short transactionOpt, InterfaceConnection ic) {
		int wlength = Header.sizeOf();
		LogicalByteArray buf;

		wlength += TRANSPORT.size_int; // dialogueId
		wlength += TRANSPORT.size_short; // transactionOpt

		buf = new LogicalByteArray(wlength, Header.sizeOf(), ic.getByteSwap());

		buf.insertInt(dialogueId);
		buf.insertShort(transactionOpt);

		return buf;
	}
}
