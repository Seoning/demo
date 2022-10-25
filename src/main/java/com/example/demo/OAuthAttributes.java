/*
 * package com.example.demo;
 * 
 * import java.util.Map;
 * 
 * import lombok.AllArgsConstructor; import lombok.Builder; import
 * lombok.NoArgsConstructor;
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Builder
 * 
 * @Getterpublic class OAuthAttributes { private Map<String, Object> attributes;
 * private String nameAttributeKey; private String username; private String
 * nickname; private String email; private Role role; public static
 * OAuthAttributes of(String registrationId, String userNameAttributeName,
 * Map<String, Object> attributes) { 구글인지 네이버인지 카카오인지 구분하기 위한 메소드 (ofNaver,
 * ofKaKao) return ofGoogle(userNameAttributeName, attributes); } private static
 * OAuthAttributes ofGoogle(String userNameAttributeName, Map<String, Object>
 * attributes) { return OAuthAttributes.builder() .username((String)
 * attributes.get("email")) .email((String) attributes.get("email"))
 * .nickname((String) attributes.get("name")) .attributes(attributes)
 * .nameAttributeKey(userNameAttributeName) .build(); } public User toEntity() {
 * return User.builder() .username(email) .email(email) .nickname(nickname)
 * .role(Role.SOCIAL) .build(); } }
 */