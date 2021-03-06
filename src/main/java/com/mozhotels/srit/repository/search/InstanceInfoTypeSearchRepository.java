package com.mozhotels.srit.repository.search;

import com.mozhotels.srit.domain.InstanceInfoType;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the InstanceInfoType entity.
 */
public interface InstanceInfoTypeSearchRepository extends ElasticsearchRepository<InstanceInfoType, Long> {
}
