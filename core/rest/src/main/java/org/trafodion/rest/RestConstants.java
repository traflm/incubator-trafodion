/**
 *(C) Copyright 2015 Hewlett-Packard Development Company, L.P.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.trafodion.rest;

/**
 * Common constants for org.trafodion.rest
 */
public interface RestConstants {
  public static final String VERSION_STRING = org.trafodion.rest.util.VersionInfo.getVersion();

  public static final String MIMETYPE_TEXT = "text/plain";
  public static final String MIMETYPE_HTML = "text/html";
  public static final String MIMETYPE_XML = "text/xml";
  public static final String MIMETYPE_BINARY = "application/octet-stream";
  public static final String MIMETYPE_PROTOBUF = "application/x-protobuf";
  public static final String MIMETYPE_PROTOBUF_IETF = "application/protobuf";
  public static final String MIMETYPE_JSON = "application/json";

  public static final String CRLF = "\r\n";
}
